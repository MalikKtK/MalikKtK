package com.example.mars.mockito;

import com.example.mars.model.Photo;
import com.example.mars.service.PhotoService;
import com.example.mars.service.PhotoService2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MockPhotoService {

    @Autowired
    PhotoService photoService;

    @Test
    void testInlineMap() {
        Map<Integer, String> mapreal = new HashMap<>();
        mapreal.put(123, "photo123");
        String str = mapreal.get(123);
        assertEquals("photo123", str);
    }

    @Test
    void testInlineMockNothing() {
        Map<Integer, String> mapMock = mock(Map.class);
        mapMock.put(123, "photo123"); //nothing happens to the mapMock object
        String str = mapMock.get(123);
        System.out.println(str);
    }

    @Test
    void testInlineMock() {
        Map<Integer, String> mapMock = mock(Map.class);
        //mapMock.put(123, "photo123");
        when(mapMock.get(123)).thenReturn("photo123");
        assertEquals("photo123", mapMock.get(123));
    }

    @Test
    void testPhotoServiceMock() {
        PhotoService mockserv = mock(PhotoService.class);
        List<Photo> photos = mockserv.findAllLastDigit(4);
        assertEquals(0, photos.size());
        Photo photo = new Photo();
        photo.setId(1234);
        List<Photo> somePhotos = new ArrayList<>();
        somePhotos.add(photo);
        when(mockserv.findAllLastDigit(4)).thenReturn(somePhotos);
        List<Photo> mockphotos = mockserv.findAllLastDigit(4);
        assertEquals(true, mockphotos.size()>0);
    }

    @Test
    void testPhotoServiceInterfaceMock() {
        PhotoService2 mockserv = mock(PhotoService2.class);
        //mockserv.
    }

    @Test
    void testPhotoService() {
        List<Photo> photos = photoService.findAllLastDigit(4);
        assertNotEquals(0, photos.size());
        Photo photo = photos.get(0);
        String str = "" + photo.getId();
        String digit = str.substring(str.length() - 1);
        assertEquals("4", digit);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testPhotoServiceDigit(int digit) {
        List<Photo> photos = photoService.findAllLastDigit(digit);
        assertNotEquals(0, photos.size());
        Photo photo = photos.get(0);
        String str = "" + photo.getId();
        String last = str.substring(str.length() - 1);
        assertEquals("" +digit, last);
    }

}

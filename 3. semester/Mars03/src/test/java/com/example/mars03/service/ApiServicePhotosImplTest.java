package com.example.mars03.service;

import com.example.mars03.model.Photo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServicePhotosImplTest {

    @Autowired
    ApiServicePhotosImpl apiServicePhotosImpl;

    @Test
    void testGetPhotosSol10() {
        List<Photo> photos = apiServicePhotosImpl.getPhotos();
        System.out.println("photos size=" + photos.size());
        assertEquals(true, photos.size()>1);
    }

}

package com.example.mars.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockList {

    @Test
    void test1() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    void test2() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3); //first time called return 2, second time return 3
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    void test4() {
        List<String> listMock = mock(List.class);
        listMock.add("hej");
        assertEquals(0, listMock.size());
        when(listMock.get(0)).thenReturn("firstelem");
        assertEquals("firstelem", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void test5() {
        List<String> listMock = mock(List.class);
        listMock.add("hej");
        assertEquals(0, listMock.size());
        //It is called Argument Matcher
        when(listMock.get(anyInt())).thenReturn("anyelem");
        for (int i = 0; i<10; i++) {
            assertEquals("anyelem", listMock.get(i));
        }
    }

    @Test
    void test7() {
        List<String> listMock = mock(List.class);
        listMock.add("hej");
        assertEquals(0, listMock.size());
        //It is called Argument Matcher
        when(listMock.get(anyInt())).thenReturn("anyelem");
        when(listMock.get(5)).thenThrow(new RuntimeException("I cant handle 5"));
        Assertions.assertThrows(RuntimeException.class, () -> {
            for (int i = 0; i<6; i++) {
                assertEquals("anyelem", listMock.get(i));
            }
        });
    }


}

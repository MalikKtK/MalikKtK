package com.example.mars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArray {

    void testArr() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,5,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    void testArrNull() {
        int[] numbers = null;
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        //assertEquals(expected, numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    void testArrNullPointerExc() {
        int[] numbers = null;
        int[] expected = {1,3,4,12};
        try {
            Arrays.sort(numbers);
            assertArrayEquals(expected, numbers);
        } catch(NullPointerException nullerr) {
            System.out.println("Nullexp err=" + nullerr.getMessage());
        }
        //assertEquals(expected, numbers);
    }



}

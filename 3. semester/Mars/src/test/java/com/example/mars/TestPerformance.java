package com.example.mars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestPerformance {

    @Test
    void testSortPerformance() {
        int[] numbers = {12, 23, 4};
        int[] actualResult = assertTimeout(ofSeconds(1), () -> {
            for (int i = 1; i <= 1000; i++) {
                numbers[2] = i;
                Arrays.sort(numbers);
            }
            return numbers;
        });
        int[] expected = {1, 2, 100};
        expected[2] = 1000;
        Arrays.sort(expected);
        assertArrayEquals(expected, numbers);
    }


    @Test
    void testSortPerformanceLongtime() {
        int[] numbers = {12, 23, 4};
        int[] actualResult = assertTimeout(ofSeconds(1), () -> {
            for (int i = 1; i <= 1000000000; i++) {
                numbers[2] = i;
                Arrays.sort(numbers);
            }
            return numbers;
        });
        int[] expected = {1, 2, 100};
        expected[2] = 1000000000;
        Arrays.sort(expected);
        assertArrayEquals(expected, numbers);
    }


}

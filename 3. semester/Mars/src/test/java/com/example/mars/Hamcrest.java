package com.example.mars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.arrayContaining;

public class Hamcrest {

    @Test
    void testHam1() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(99,100));
        assertThat(scores, everyItem(greaterThan(90)));
        assertThat(scores, everyItem(lessThan(190)));

        //String
        assertThat("", blankString());
        assertThat(null, blankOrNullString());

        //Arrays
        Integer[] marks = {1, 2, 3, 4};
        assertThat(marks, arrayWithSize(4));
        assertThat(marks, arrayContaining(1,2,3,4));
    }


}

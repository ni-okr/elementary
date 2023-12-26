package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenLeft1Right2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft10Right100Then100() {
        int left = 10;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}
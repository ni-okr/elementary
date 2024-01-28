package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);

    }

    @Test
    void whenCalculateFactorialFor15Then2004189184() {
        int expected = 2004189184;
        int n = 16;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);

    }
}
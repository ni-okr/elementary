package ru.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To90Then2068() {
        int start = 3;
        int finish = 90;
        int result = Counter.sumByEven(start, finish);
        int expected = 2068;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersFrom3To90Then4092() {
        int start = 3;
        int finish = 90;
        int result = Counter.sum(start, finish);
        int expected = 4092;
        assertThat(result).isEqualTo(expected);
    }
}
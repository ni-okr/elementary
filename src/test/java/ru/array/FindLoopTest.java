package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10Then1() {
        int[] data = new int[]{5, 10, 3};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot3Then2() {
        int[] data = new int[]{5, 10, 3};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot9ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot99ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int el = 99;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonStart1Finish11ThenMinus1() {
        int[] data = new int[]{5, 10, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int el = 82;
        int start = 1;
        int finish = 11;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonStart1Finish11Then7() {
        int[] data = new int[]{5, 10, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int el = 8;
        int start = 1;
        int finish = 11;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}

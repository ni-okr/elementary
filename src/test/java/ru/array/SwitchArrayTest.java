package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap5to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 5;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 10, 7, 8, 9, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 2;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 10, 4, 5, 6, 7, 8, 9, 3};
        assertThat(result).containsExactly(expected);
    }
}
package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWith5ddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWith9ddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWith10ddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{32, 16, 47, 54, 75, 36, 27, 98, 89, 64};
        int[] result = Turn.back(input);
        int[] expected = new int[]{64, 89, 98, 27, 36, 75, 54, 47, 16, 32};
        assertThat(result).containsExactly(expected);
    }
}
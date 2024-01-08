package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort500() {
        int[] data = new int[]{500, 100, 800, 50};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{50, 100, 500, 800};
        assertThat(result).containsExactly(expected);
    }
}
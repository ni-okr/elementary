package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else {
                i++;
            }
            if (i == j - 1) {
                i = 0;
                j--;
            }
        }
        return new int[0];
    }
}


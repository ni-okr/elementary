package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] != target) {
                if (array[i] + array[j] > target) {
                    array[j] = 0;
                    j--;
                } else if (array[i] + array[j] < target) {
                    array[i] = 0;
                    i++;
                }
            } else {
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}


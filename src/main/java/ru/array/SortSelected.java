package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            index = FindLoop.indexInRange(data, min, index, data.length - 1);
            int[] swap = SwitchArray.swap(data, min - 1, index);
        }
        return data;
    }
}

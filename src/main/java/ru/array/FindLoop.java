package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        int[] arr = data;
        for (int index = 0; index < data.length; index++) {
            if (arr[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
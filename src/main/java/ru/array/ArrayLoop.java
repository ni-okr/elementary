package ru.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 3;
        }
        for (int number : arr) {
            System.out.println(number);
        }
    }
}

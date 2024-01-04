package ru.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] m = new int[5];
        for (int i = 0; i < m.length; i++) {
            int y = i * 2 + 3;
            m[i] = y;
        }
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}

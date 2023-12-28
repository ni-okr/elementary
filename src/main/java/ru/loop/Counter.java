package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int s = start; s <= finish; s++) {
            sum += s;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int s = start; s <= finish; s++) {
            if (s % 2 == 0) {
                sum += s;
            }
        }
        return sum;
    }
}
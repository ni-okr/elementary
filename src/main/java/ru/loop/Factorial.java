package ru.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int f = result; f <= n; f++) {
            result *= f;
        }
        return result;
    }
}
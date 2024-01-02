package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 1; index <= number; index++) {
            if (number % 5 == 0) {
                prime = true;
                break;
            } else {
                break;
            }
        }
        return prime;
    }
}
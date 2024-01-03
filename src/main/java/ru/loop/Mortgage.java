package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        while (amount > 0) {
            amount = amount + (amount * percent);
            amount = amount - salary;
            year++;
        }
        return year;
    }
}

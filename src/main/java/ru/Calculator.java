package ru;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println("plus = " + result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println("minus = " + result);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
//дз 1.3
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

//дз 1.4
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println("sizeMinusFive = " + size);

        System.out.println("onePlusTwo = " + onePlusTwo);
        System.out.println("sixDivTwo = " + sixDivTwo);
        System.out.println("fiveMinusTwo = " + fiveMinusTwo);
        System.out.println("fourTimeTwo = " + fourTimeTwo);
//дз 1.8
        plus(1, 2);
        plus(10, 11);
        minus(7, 3);
        minus(2, 6);
    }
}

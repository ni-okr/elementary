package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(105, 29, 32, 41);
        System.out.println("result (105, 32) to (29, 41) = " + result);
    }
}

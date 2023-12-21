package ru.calculator;

public class MathFunc {

    public static int func1(int args) {
        int x = 3;
        int y = x * x + 1;
        return y;
    }

    public static void main(String[] args) {
        int result3 = MathFunc.func1(3);
        System.out.println("result3 = " + result3);
    }
}

package ru.calculator;

public class MathFunc {

    public static int func1(int args) {
        int x = 3;
        int y = x * x + 1;
        return y;
    }

    public static int func2(int args) {
        int x = 3;
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(3);
        int total = result1 + result2;
        System.out.println("total = " + total);

        int result3 = MathFunc.func1(3);
        System.out.println("result3 = " + result3);
    }
}

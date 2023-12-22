package ru.calculator;

import static ru.math.MathFunction.multiply;
import static ru.math.MathFunction.sum;
import static ru.math.MathFunction.minus;
import static ru.math.MathFunction.division;

public class MathCalculator {
    public static double sumAndMinusAndDivision(double first, double second) {
        return sum(first, second) + minus(first, second) + division(first, second);
    }

    public static double multiplyAndSumAndMinusAndDivision(double first, double second) {
        return multiply(first, second) + sum(first, second) + minus(first, second) + division(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumAndSum(double first, double second) {
        return sum(first, second) + sum(first, second);
    }

    public static double sumAndMinus(double first, double second) {
        return sum(first, second) + minus(first, second);
    }

    public static double sumAndDivision(double first, double second) {
        return sum(first, second) + division(first, second);
    }

    public static double minusAndMultiply(double first, double second) {
        return minus(first, second) + multiply(first, second);
    }

    public static double minusAndMinus(double first, double second) {
        return minus(first, second) + minus(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double minusAndSum(double first, double second) {
        return minus(first, second) + sum(first, second);
    }

    public static double divisionAndMultiply(double first, double second) {
        return division(first, second) + multiply(first, second);
    }

    public static double divisionAndDivision(double first, double second) {
        return division(first, second) + division(first, second);
    }

    public static double divisionAndSum(double first, double second) {
        return division(first, second) + sum(first, second);
    }

    public static double divisionAndMinus(double first, double second) {
        return division(first, second) + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMinusAndDivision равен: " + sumAndMinusAndDivision(10, 20));
        System.out.println("Результат расчета multiplyAndSumAndMinusAndDivision равен: " + multiplyAndSumAndMinusAndDivision(10, 20));
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumAndSum равен: " + sumAndSum(10, 20));
        System.out.println("Результат расчета sumAndMinus равен: " + sumAndMinus(10, 20));
        System.out.println("Результат расчета sumAndDivision равен: " + sumAndDivision(10, 20));
        System.out.println("Результат расчета minusAndMultiply равен: " + minusAndMultiply(10, 20));
        System.out.println("Результат расчета minusAndMinus равен: " + minusAndMinus(10, 20));
        System.out.println("Результат расчета minusAndDivision равен: " + minusAndDivision(10, 20));
        System.out.println("Результат расчета minusAndSum равен: " + minusAndSum(10, 20));
        System.out.println("Результат расчета divisionAndMultiply равен: " + divisionAndMultiply(10, 20));
        System.out.println("Результат расчета divisionAndDivision равен: " + divisionAndDivision(10, 20));
        System.out.println("Результат расчета divisionAndSum равен: " + divisionAndSum(10, 20));
        System.out.println("Результат расчета divisionAndMinus равен: " + divisionAndMinus(10, 20));
    }
}
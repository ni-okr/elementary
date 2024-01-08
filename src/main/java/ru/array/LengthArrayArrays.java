package ru.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbersA = {{1}};
        int[][] numbersB = {{1, 2}};
        int[][] numbersC = {{1, 2, 3}};
        int[][] numbersD = {{1, 2, 3, 4}};
        for (int i = 0; i < numbersA.length; i++) {
            System.out.println("Размер вложенного массива A равен: " + numbersA[i].length);
        }
        for (int i = 0; i < numbersB.length; i++) {
            System.out.println("Размер вложенного массива B равен: " + numbersB[i].length);
        }
        for (int i = 0; i < numbersC.length; i++) {
            System.out.println("Размер вложенного массива C равен: " + numbersC[i].length);
        }
        for (int i = 0; i < numbersD.length; i++) {
            System.out.println("Размер вложенного массива D равен: " + numbersD[i].length);
        }
    }
}
package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        System.out.println("задание 5.1 + 5.2");
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println();

        System.out.println("задание 5.3");
        String[] names = new String[4];
        names[0] = "Трололоев Ололош";
        names[1] = "Ололоев Трололош";
        names[2] = "Трололоева Ололена";
        names[3] = "Ололоева Трололена";

        System.out.println("Нулевой индекс масива содержит" + names[0]);
        System.out.println("Первый индекс масива содержит" + names[1]);
        System.out.println("Второй индекс масива содержит" + names[2]);
        System.out.println("Третий индекс масива содержит" + names[3]);
    }
}

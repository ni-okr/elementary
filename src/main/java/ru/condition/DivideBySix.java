package ru.condition;
public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 6 == 0) {
            rsl = "Число делится на 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "Число делится на 3, но не является четным.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "Число не делится на 3, но является четным.";
        } else {
            rsl = "Число не делится на 3 и не является четным.";
        }
        return rsl;
    }
}
package ru.converter;
public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 90;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float rubleE = Converter.euroToRuble(140);
        float dollar = Converter.rubleToDollar(140);
        float dollarR = Converter.dollarToRuble(140);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 euro are " + rubleE + " ruble.");
        System.out.println("140 rubles are " + dollar + " dollar.");
        System.out.println("140 dollar are " + dollarR + " rubles.");
    }
}
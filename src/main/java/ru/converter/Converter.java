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
        System.out.println();
        System.out.println("Тесты на валидацию конвертации");
// кейс rubleToEuro
        float in = 140;
        float expectedRE = 1.4f;
        float outRE = Converter.rubleToEuro(in);
        boolean passedRE = expectedRE == outRE;
        System.out.println("проверка rubleToEuro : " + passedRE);
// кейс euroToRuble
        float expectedER = 14000.0f;
        float outER = Converter.euroToRuble(in);
        boolean passedER = expectedER == outER;
        System.out.println("проверка euroToRuble : " + passedER);
// кейс rubleToDollar
        float expectedRD = 1.5555556f;
        float outRD = Converter.rubleToDollar(in);
        boolean passedRD = expectedRD == outRD;
        System.out.println("проверка rubleToDollar : " + passedRD);
// кейс dollarToRuble
        float expectedDR = 12600.0f;
        float outDR = Converter.dollarToRuble(in);
        boolean passedDR = expectedDR == outDR;
        System.out.println("проверка dollarToRuble : " + passedDR);
    }
}
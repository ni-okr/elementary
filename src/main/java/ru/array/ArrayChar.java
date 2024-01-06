package ru.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length - 1; index++) {
            if (pref[index + 1] != word[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
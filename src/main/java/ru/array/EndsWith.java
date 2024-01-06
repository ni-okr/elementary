package ru.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[word.length - post.length + index]) {
                result = false;
            }
        }
        return result;
    }
}
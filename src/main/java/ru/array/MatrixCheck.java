package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][0] != board[row][(board.length - 1) - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
package ru.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] != board[i][row + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
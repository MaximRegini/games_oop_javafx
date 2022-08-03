package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != '1') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean rsl = true;
        for (int j = 0; j < board[column].length; j++) {
            if (board[column][j] != '1') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int e = 0; e < board.length; e++) {
            if (board[e][e] == '1' && monoHorizontal(board, e) || monoVertical(board, e))
            {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}

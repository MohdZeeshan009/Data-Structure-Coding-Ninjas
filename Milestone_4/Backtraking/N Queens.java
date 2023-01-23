public class Solution {

    public static void printSolution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 1) return false;
            if (board[i][col] == 1) return false;
        }
        for (int i = 1; i < n; i++) {
            if (row + i < n && col + i < n && board[row + i][col + i] == 1) return false;
            if (row - i >= 0 && col - i >= 0 && board[row - i][col - i] == 1) return false;
            if (row - i >= 0 && col + i < n && board[row - i][col + i] == 1) return false;
            if (row + i < n && col - i >= 0 && board[row + i][col - i] == 1) return false;
        }
        return true;
    }

    public static boolean placeQueens(int n, int row, int[][] board) {
        if (row == n) {
            return true;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 1;
                if (placeQueens(n, row + 1, board)) {
                    printSolution(board);
                }
                board[row][j] = 0;
            }
        }
        return false;
    }
    public static void placeNQueens(int n) {
        placeQueens(n, 0, new int[n][n]);
    }
}
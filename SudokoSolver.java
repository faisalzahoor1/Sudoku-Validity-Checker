public class SudokoSolver {

    public static boolean isSafe(char board[][], int row, int col, int number) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char board[][], int row, int col) {
        if (row == board.length-1 && col == board.length-1) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            ncol = col + 1;
            nrow = row;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }else {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, nrow, ncol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }
                }
            }

        return false;
    }

    public static void sudoko(char board[][]) {
        if (helper(board, 0, 0)) {
            System.out.println("Sudoku solved successfully:");
            printBoard(board);
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }

    public static void printBoard(char board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        sudoko(board);
    }
}

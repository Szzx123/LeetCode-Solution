package lc036;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //用三个矩阵存状态 顺序0-9 有了就+1 大于1就false
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] sub = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char tmp = board[i][j];
                if (tmp != '.') {
                    int index = tmp - '0' - 1;
                    row[i][index]++;
                    col[index][j]++;
                    sub[i/3][j/3][index]++;
                    if (row[i][index] > 1 || col[index][j] > 1 || sub[i/3][j/3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

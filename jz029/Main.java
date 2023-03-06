package jz029;

public class Main {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int l = 0, r =  matrix[0].length-1, t = 0, b = matrix.length-1;
        int[] ans = new int[(r + 1) * (b + 1)];
        int count = 0;
        while (true) {
            //顶横
            for (int i = l; i <= r; i++) {
                ans[count++] = matrix[t][i];
            }
            if (++t > b){
                break;
            }
            //右竖
            for (int i = t; i <= b; i++) {
                ans[count++] = matrix[i][r];
            }
            if (--r < l){
                break;
            }
            //底横
            for (int i = r; i >= l; i--) {
                ans[count++] = matrix[b][i];
            }
            if (--b < t){
                break;
            }
            //左竖
            for (int i = b; i >= t; i--) {
                ans[count++] = matrix[i][l];
            }
            if (++l > r){
                break;
            }
        }
        return ans;
    }
}

package lc054;

import java.util.ArrayList;
import java.util.List;

public class lc054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return ans;
        }
        int l = 0, r =  matrix[0].length-1, t = 0, b = matrix.length-1;
        int count = 0;
        while (true) {
            //顶横
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            if (++t > b){
                break;
            }
            //右竖
            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            if (--r < l){
                break;
            }
            //底横
            for (int i = r; i >= l; i--) {
                ans.add(matrix[b][i]);
            }
            if (--b < t){
                break;
            }
            //左竖
            for (int i = b; i >= t; i--) {
                ans.add(matrix[i][l]);
            }
            if (++l > r){
                break;
            }
        }
        return ans;
    }
}

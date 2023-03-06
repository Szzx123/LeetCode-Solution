package lc343;

public class Solution {
    public int integerBreak(int n) {
        //d[i]位由d[i-j]*j或(i-j)*j或是本身自己已经是最大更新
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i-j]*j, (i-j)*j));
            }
        }
        return dp[n];
    }
}

package lc121;

public class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        //初始化 一个是第一天的卖价 一个是0 因为只能买不能卖
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
}

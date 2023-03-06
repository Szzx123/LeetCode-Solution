package jz063;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int dp = 0;
        int cost = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cost = Math.max(-prices[i], cost);
            dp = Math.max(dp, cost+prices[i]);
        }
        return dp;
    }
}

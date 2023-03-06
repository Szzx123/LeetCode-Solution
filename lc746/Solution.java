package lc746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[2];
        dp[0] = 0;
        dp[1] = 0;
        //int[] dp = new int(cost.length+1)
        //顶到length 为了计算到楼顶的花费
        for(int i = 2; i <= cost.length; i++) {
            int spend = Math.min((dp[0]+cost[i-2]), (dp[1]+cost[i-1]));
            dp[0] = dp[1];
            dp[1] = spend;
        }
        return dp[1];
        //return do[cost.length+1]
    }
}

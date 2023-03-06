package lc053;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            max = nums[0];
            return max;
        }
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i]+dp[i-1]);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}

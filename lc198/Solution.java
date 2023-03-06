package lc198;

public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        int max = Math.max(dp[1], dp[2]);
        for (int i = 3; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
    public int robv2(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            //对于这个 要么是上一个大 要么是自己加上上个大 这样一来 下一个的时候 如果上一个大就记进去了
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);

        }
        return dp[nums.length-1];
    }



}

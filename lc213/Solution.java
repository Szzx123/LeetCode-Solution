package lc213;

public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max = Math.max(robJudge(nums, 0, len-1), robJudge(nums, 1, len));
        return max;
    }
    public int robJudge(int[] nums, int begin, int end) {
        int[] dp = new int[nums.length];
        dp[begin] = nums[begin];
        dp[begin+1] = Math.max(nums[begin], nums[begin+1]);

        for (int i = begin+2; i < end; i++) {
            //对于这个 要么是上一个大 要么是自己加上上个大 这样一来 下一个的时候 如果上一个大就记进去了
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);

        }
        return dp[end-1];
    }
}

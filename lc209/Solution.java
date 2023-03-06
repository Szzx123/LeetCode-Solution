package lc209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        //右指针开始计数，如果大的话 先比结果 再动左指针 因为这种情况可以i j可以同一位 所以这次j比j大了 下一个for i就回来了
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                minNum = Math.min(minNum, right-left+1);
                sum -= nums[left++];
            }
        }
        return minNum == Integer.MAX_VALUE ? 0 : minNum;
    }
}

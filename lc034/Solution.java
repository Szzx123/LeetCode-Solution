package lc034;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] ans = new int[2];
        if (r < 0 || (r == 0 && target != nums[0])) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        if (r == 1) {
            if (target != nums[1] && target != nums[0]) {
                ans[0] = -1;
                ans[1] = -1;
                return ans;
            }

        }
        //右边界
        while (l <= r) {
            int m = (r - l) / 2 + l;
            if (nums[m] <=  target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int right = l - 1;
        // 判断是否存在
        if (r >= 0 && nums[r] != target) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        // 左边界
        l = 0;
        r = nums.length - 1;
        while (l <= r) {
            int m = (r - l) / 2 + l;
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int left = r + 1;
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
}

package lc033;

public class Solution {
    public int search(int[] nums, int target) {
        //二分时，一定是有一边有序的，看在不在有序的这边。在无序的里比会出错
        int n = nums.length;
        if (n == 0) return -1;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            //4 5 6 7 0 1 2 如果t为7 第一次就能找到 否则的话 都是向左或右找
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;//
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}

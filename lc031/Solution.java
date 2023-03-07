package lc031;

public class Solution {
    public void nextPermutation(int[] nums) {
        //先从右往左找到第一个ni比ni+1小的
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if (i >= 0) {
            //再找到最右的一个最大j
            int j = nums.length - 1;
            while (j > i && nums[i] >= nums[j]) {
                j--;
            }
            //交换位置
            swap(nums, i, j);
        }
        //对后面的进行升排序
        sort(nums, i+1);
    }
    public static void swap (int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    //经过这么交换之后，后部必然是降序的 两两交换即可
    public static void sort(int[] nums, int begin) {
        int l = begin, r = nums.length - 1;
        while (l < r) {
            swap(nums, l , r);
            l++;
            r--;
        }
    }
}

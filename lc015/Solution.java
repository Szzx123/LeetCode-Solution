package lc015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //指针k循环遍历 l f左右移动
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length-2; k++) {
            //排好序的 大于0就不用看了
            if (nums[k] > 0) break;
            //跳掉重复的 上一次已经都存了
            if (k > 0 && nums[k] == nums[k-1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    //小了就移动一位 ++i在这一位就加好了给他判断
                    while (i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}

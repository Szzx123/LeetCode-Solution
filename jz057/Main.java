package jz057;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        //Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Set<Integer> hashSet = new HashSet<Integer>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])) {
                //hashMap.put(target - nums[i], i);
                hashSet.add(target - nums[i]);
            } else {
                ans[0] = nums[i];
                ans[1] = target - nums[i];
            }
        }
        return ans;
    }
    public int[][] findContinuousSequence(int target) {
        int l = 1, r = 2, s = 3;
        List<int[]> ansList = new ArrayList<int[]>();
        while (l < r) {
            //首先看是不是答案 则返回
            if (s == target) {
                int[] ans = new int[r - l + 1];
                for (int i = l; i <= r; i++) {
                    ans[i-l] = i;
                }
                ansList.add(ans);
            }
            //将是答案情况中的移动指针和存目标 抽离 因为大于等于的操作一样
            if (s >= target) {
                s -= l;
                l++;
            } else {
                r++;
                s += r;
            }
        }
        return ansList.toArray(new int[0][]);
    }

}

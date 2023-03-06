package jz061;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isStraight(int[] nums) {
        //存入hashset
        //如果有重复的必不可能
        //无重复max-min<5成立
        int min = 14;
        int max = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (hashSet.contains(num)) {
                return false;
            }
            max = Math.max(num, max);
            min = Math.min(num, min);
            hashSet.add(num);
        }
        return max - min < 5;
    }
}

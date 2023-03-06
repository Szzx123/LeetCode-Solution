package lc169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = countNum(nums);
        Map.Entry<Integer, Integer> majorEntry = null;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (majorEntry == null || i.getValue() > majorEntry.getValue()) {
                majorEntry = i;
            }
        }
        return majorEntry.getKey();
    }

    private Map<Integer, Integer> countNum(int[] nums) {
        Map<Integer, Integer> countNum = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!countNum.containsKey(num)) {
                countNum.put(num, 1);
            } else {
                //key唯一，使用put可以直接修改value值
                countNum.put(num, countNum.get(num)+1);
            }
        }
        return countNum;
    }
}

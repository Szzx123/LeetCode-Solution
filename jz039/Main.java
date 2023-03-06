package jz039;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = countNum(nums);
        Map.Entry<Integer, Integer> most = null;
        for (Map.Entry<Integer, Integer> ptr : res.entrySet()) {
            if (most == null || ptr.getValue() > most.getValue()) {
                most = ptr;
            }
        }
        return most.getKey();
    }
    public Map<Integer, Integer> countNum(int[] nums) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!res.containsKey(num)) {
                res.put(num, 1);
            } else {
                res.put(num, res.get(num)+1);
            }
        }
        return res;
    }
}

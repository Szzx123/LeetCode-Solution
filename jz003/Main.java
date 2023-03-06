package jz003;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        int ans = -1;
        for (int num : nums) {
            if (!hashSet.add(num)) {
                ans = num;
                break;
            }
        }
        return ans;
    }
}

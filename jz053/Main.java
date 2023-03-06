package jz053;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public int missingNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int i = 0; i < nums.length+1; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public int missingNumberDivide(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            //通过这个可以看缺的在左还是在右
            if (nums[mid] == mid) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        //这样的算法left刚好对应缺的数
        return left;
    }


}

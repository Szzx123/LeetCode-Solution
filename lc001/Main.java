package lc001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {4, 2, 9 ,10, 32, 1, 6, 7};
        int target = 33;
        int[] ans = twoSumV2(arrays, target);
        for (int i : ans)
                System.out.println(i);
    }

    /**
     * 直接进行遍历暴搜
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for ( int i = 0; i < length-1; i++ ) {
            for ( int j = i+1; j < length; j++) {
                if ( nums[i] + nums[j] == target ) {
                    return new int[]{i ,j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 双指针遍历，用数组存储，并用哈希表存值
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumV2(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
                continue;
            }
            map.put(nums[i], new ArrayList<Integer>());
            map.get(nums[i]).add(i);
        }
        int length = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = length - 1;
        while ( i < j ) {
            if ( nums[i] + nums[j] == target ) {
                int pos_i = map.get(nums[i]).get(0);
                // 重复元素已经访问过一次，从对应位置列表中剔除
                map.get(nums[i]).remove(0);
                int pos_j = map.get(nums[j]).get(0);
                return new int[]{ pos_i, pos_j };
            } else if ( nums[i] + nums[j] < target ) {
                i++;
            } else if ( nums[i] + nums[j] > target ){
                j--;
            }
        }
        return new int[0];
    }
    public static int[] twoSumV3(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (hash.containsKey(target - nums[i])) {
                return new int[]{hash.get(target-nums[i]), i};
            }
            hash.put(nums[i], i);
        }
        return new int[0];
    }

}
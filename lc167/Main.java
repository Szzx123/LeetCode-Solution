package lc167;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {2,7,11,15};
        int target = 18;
        int[] ans = twoSumSortV2(arrays, target);
        for (int i : ans)
            System.out.println(i);
    }
    public static int[] twoSumSort(int[] numbers, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                map.get(numbers[i]).add(i);
                continue;
            }
            map.put(numbers[i], new ArrayList<Integer>());
            map.get(numbers[i]).add(i);
        }
        int length = numbers.length;
        int i = 0;
        int j = length - 1;
        while ( i < j ) {
            if ( numbers[i] + numbers[j] == target ) {
                int pos_i = map.get(numbers[i]).get(0);
                // 重复元素已经访问过一次，从对应位置列表中剔除
                map.get(numbers[i]).remove(0);
                int pos_j = map.get(numbers[j]).get(0);
                return new int[]{ pos_i, pos_j };
            } else if ( numbers[i] + numbers[j] < target ) {
                i++;
            } else if ( numbers[i] + numbers[j] > target ){
                j--;
            }
        }
        return new int[0];
    }

    /**
     * 双指针遍历，大于target后--，小于前++
     * @param numbers
     * @param target
     * @return
     */

    public static int[] twoSumSortV2(int[] numbers, int target) {
        int length = numbers.length;
        int i = 0;
        int j = length - 1;
        while ( i < j ) {
            if ( numbers[i] + numbers[j] == target ) {
                return new int[]{ i+1, j+1 };
            } else if ( numbers[i] + numbers[j] < target ) {
                i++;
            } else if ( numbers[i] + numbers[j] > target ){
                j--;
            }
        }
        return new int[0];
    }
}
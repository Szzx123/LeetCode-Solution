package jz056;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        //先遍历数组
        int z = 0;
        for (int num : nums) z ^= num;
        //搞出不等的那位 因为是异或 1的那位不等
        int h = 1;
        while ((z & h) == 0) h <<= 1;
        // 分成两组
        int x = 0, y = 0;
        for (int num : nums) {
            if ((h&num) == 0) x ^= num;
            else y ^= num;
        }
        return new int[] {x, y};
    }
}

package lc066;

public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                //这里的目的是：1. 如果开始就没有9 直接返回 2. 如果尾是9 到下一个不是9的 加1
                return digits;
            }
        }
        int[] ans = new int[length+1];
        ans[0] = 1;
        return ans;
    }
}

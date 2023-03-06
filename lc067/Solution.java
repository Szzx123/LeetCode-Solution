package lc067;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int n = Math.max(a.length(), b.length());
        int carry = 0;
        //carry一直会被循环使用到下一次计算 直接用carry累加结果
        for (int i = 0; i < n; i++) {
            //倒着数 就不用栈了
            carry += i < a.length() ? (a.charAt(a.length()- i - 1) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length()- i - 1) - '0') : 0;
            ans.append((char)(carry % 2 + '0'));
            // 0 1 2 3三种 0和1是0不管 2 3都要进1
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        return ans.reverse().toString();
    }
}

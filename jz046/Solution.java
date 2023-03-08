package jz046;

public class Solution {
    public int translateNum(int num) {
        int length = Integer.toString(num).length();
        if (length == 1) {
            return 1;
        }
        int[] dp = new int[length+1];
        String str = Integer.toString(num);
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            String tmp = str.substring(i - 2, i);
            if (Integer.valueOf(tmp.toString()).intValue() <= 25 && Integer.valueOf(tmp.toString()).intValue() >= 10){
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[length];
    }
}

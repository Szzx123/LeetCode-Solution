package jz014;

public class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i-1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i-j]*j, (i-j)*j));
            }
        }
        return dp[n];
    }

    public int cuttingRope2(int n) {
        if(n <= 3) return n - 1;
        int b = n % 3, p = 1000000007;

        long rem = 1, x = 3 ,a = n / 3;
        //直接套循环求余公式
        for(int i = 0; i < ((b == 1)?a-1:a); i++) { //b == 1代表余数为1的时候，需要单独取出一个3出来凑成2*2达到最大值效果
            rem = (rem * x) % p;
        }
        if(b == 0) return (int)(rem % p);
        if(b == 1) return (int)(rem * 4 % p);
        return (int)(rem * 2 % p);
    }
}

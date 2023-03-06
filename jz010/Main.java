package jz010;

public class Main {
    public int fib(int n) {
        final int mod = 1000000007;
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 0, c = 1;
        for (int i = 2; i <= n; i++) {
            a = b;
            b = c;
            c = (a + b) % mod;
        }
        return c;
    }

    public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[3];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int sum = (dp[1] + dp[2]) % 1000000007;
            dp[1] = dp[2];
            dp[2] = sum;
        }
        return dp[2];
    }
}

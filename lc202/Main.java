package lc202;

public class Main {
    /**
     * 快慢指针
     */
    public boolean isHappy(int n) {
        int slowNum = n;
        int fastNum = totoalNum(n);
        //要么等于1 要么必相等
        while (fastNum != slowNum) {
            slowNum = totoalNum(slowNum);
            if (slowNum == 1) {
                return true;
            }
            fastNum = totoalNum(totoalNum(fastNum));
        }
        return fastNum == 1;
    }
    public int totoalNum(int n) {
        int res = 0;
        while (n > 0) {
            int tmp = n % 10;
            res += tmp * tmp;
            n = n / 10;
        }
        return res;
    }
}

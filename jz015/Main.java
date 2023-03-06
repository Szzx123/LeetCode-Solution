package jz015;

public class Main {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        //int型编码为32位
        for (int i = 0; i < 32; i++) {
            //左移i位0001000，只有相应位置i不是0才结果不是0
            if ((n&(1<<i)) != 0) {
                result++;
            }
        }
        return result;
    }
}

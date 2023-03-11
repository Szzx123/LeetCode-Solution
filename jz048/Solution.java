package jz048;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int[] dp = new int[s.length()+1];
        dp[0] = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = hashMap.getOrDefault(s.charAt(i), -1);
            //没有就给-1 那么i-j肯定比tmp大 就让tmp+1
            hashMap.put(s.charAt(i), i);
            //小的话 就是重了 给它换成i-j就是不重的长度
            tmp = tmp < i - j ? tmp + 1 : i - j;
            dp[i+1] = Math.max(tmp, dp[i]);
        }
        return dp[s.length()];
    }
}

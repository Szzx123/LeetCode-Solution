package jz050;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> hashMap = new HashMap<Character, Boolean>();
        char[] newStr = s.toCharArray();
        for (char c : newStr) {
            //如果不错在就存true，存在过了就是false
            hashMap.put(c, !hashMap.containsKey(c));
        }
        for (char c : newStr) {
            //第一个true的就是答案
            if (hashMap.get(c)){
                return c;
            }
        }
        return ' ';
    }
}

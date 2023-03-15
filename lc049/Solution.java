package lc049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 遍历 计算它的key值 存在了就加 不存在就新开
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            int[] stringKey = new int[26];
            for (int i = 0; i < str.length(); i++) {
                stringKey[str.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (stringKey[i] != 0) {
                    sb.append((char)('a')+i);
                    sb.append(stringKey[i]);
                }
                // sb.append(stringKey[i]);
            }
            String key = sb.toString();
            System.out.println(key);
            List<String> value = hashMap.getOrDefault(key, new ArrayList<String>());
            value.add(str);
            hashMap.put(key, value);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}

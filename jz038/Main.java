package jz038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    List<String> res = new ArrayList<>();
    StringBuilder temp = new StringBuilder();
    boolean[] used;
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);
        used = new boolean[s.length()];
        backTracking(s);
        return res.toArray(new String[res.size()]);
    }
    private void backTracking(String s) {
        if (temp.length() == s.length()) {
            res.add(temp.toString());
            return;
        }
        for (int i = 0; i <= s.length()-1; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i-1) && used[i-1] == false) {
                continue;
            }
            if (used[i] == false) {
                used[i] = true;
                temp.append(s.charAt(i));
                backTracking(s);
                used[i] = false;
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}

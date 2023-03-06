package jz058;

import java.util.Stack;

public class Main {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        if (s == null) {
            return null;
        }
        Stack<String> stack = new Stack<String>();
        s = s + ' ';
        char[] tmp = s.toCharArray();
        StringBuilder stackTmp = new StringBuilder();
        for (char i : tmp) {
            if (i != ' ') {
                stackTmp.append(i);
            } else {
                if (!("".equals(stackTmp.toString()))) {
                    stack.push(stackTmp.toString());
                    stackTmp.delete(0, stackTmp.length());
                }
            }
        }
        //StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
            ans.append(' ');
        }
        if (!ans.isEmpty()) {
            ans.deleteCharAt(ans.length()-1);
        }
        return ans.toString();
    }
    public String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        char[] tmp = new char[n];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            tmp[i] = cs[i];
        }
        for (int i = n; i < cs.length; i++) {
            ans.append(cs[i]);
        }
        for (int i = 0; i < tmp.length; i++) {
            ans.append(tmp[i]);
        }
        return ans.toString();
    }

}

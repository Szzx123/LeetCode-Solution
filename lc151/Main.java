package lc151;

import java.util.Stack;

public class Main {
    public String reverseWords(String s) {
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
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
            ans.append(' ');
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}

package lc017;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = new ArrayList<>();
    StringBuilder temp = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //迭代处理
        backTracking(digits, numString, 0);
        return result;
    }
    private void backTracking(String digits, String[] numString, int index) {
        //比如23 ab就是两个 会调用三层 就是index从0变到2 此时结束调用
        if (index == digits.length()) {
            result.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(index) - '0'];
        //横向是每个数字包含字母的长度
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            //递归的纵向是输入digit的深度，每次都由起始的+1
            backTracking(digits, numString, index+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }

}


// void backtracking(参数) {
//     if (终止条件) { index长度和digit长度一样时结束 23 就是ab
//         存放结果;
//         return;
//     }

//     for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) { 循环所有digit中的元素
//         处理节点; 放入
//         backtracking(路径，选择列表); // 递归
//         回溯，撤销处理结果 删掉尾部
//     }
// }

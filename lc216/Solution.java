package lc216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 0, 1);
        return result;
    }
    private void backTracking(int k, int n, int tmpSum, int startIndex) {
        if (tmpSum > n) {
            return;
        }
        if (k == path.size()) {
            if (tmpSum == n) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            tmpSum += i;
            backTracking(k, n, tmpSum, i+1);
            tmpSum -= i;
            path.removeLast();
        }
    }
}


// void backtracking(参数) {
//     if (终止条件) { k个遍历到了 有答案存放 无答案返回该深度的调用
//         存放结果;
//         return;
//     }

//     for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
//         处理节点;取i并和sum搞到sum上 并存i
//         backtracking(路径，选择列表); // 递归 把现有的sum传给下一个
//         回溯，撤销处理结果 拿走i 并sum减掉
//     }
// }
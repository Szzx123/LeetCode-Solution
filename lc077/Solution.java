package lc077;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return result;
    }
    private void backTracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backTracking(n, k, i+1);
            path.removeLast();
        }
    }
}



// void backtracking(参数) {
//     if (终止条件) {
//         存放结果;
//         return;
//     }

//     for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
//         处理节点;
//         backtracking(路径，选择列表); // 递归
//         回溯，撤销处理结果
//     }
// }

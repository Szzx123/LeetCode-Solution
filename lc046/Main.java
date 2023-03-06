package lc046;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    List<List<Integer>> res= new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    //要注意 和前面有startIndex的不一样，那种重复的后面会被抽掉，但这是排列21和12不一样，所以要记用没用过
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0){
            return res;
        }
        used = new boolean[nums.length];
        backTracking(nums);
        return res;
    }
    private void backTracking(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        //这里的循环比如i=0，会调之后的nums 也会从0开始遍历，这样用used，在递归中，用过的会被跳过
        for (int i = 0; i <= nums.length-1; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backTracking(nums);
            used[i] = false;
            path.removeLast();
        }
    }
}

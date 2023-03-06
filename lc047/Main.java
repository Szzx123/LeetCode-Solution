package lc047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    //要注意 和前面有startIndex的不一样，那种重复的后面会被抽掉，但这是排列21和12不一样，所以要记用没用过
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTracking(nums, used);
        return res;
    }
    private void backTracking(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        //这里的循环比如i=0，会调之后的nums 也会从0开始遍历，这样用used，在递归中，用过的会被跳过
        for (int i = 0; i <= nums.length-1; i++) {
            //如果和前面的相等又是false 说明前面的已经被用过一次并被回溯了
            if (i > 0 && nums[i] == nums[i-1] && used[i-1] == false) {
                continue;
            }
            if (used[i] == false) {
                used[i] = true;
                path.add(nums[i]);
                backTracking(nums, used);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}

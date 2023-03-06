package lc080;

public class Main {
    /**
     * 用flag标记出现次数，如果2次了才当作不等处理
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int length = nums.length;
        int count = 0;
        for (int right=1; right < length; right++) {
            if (nums[right] != nums[right-1]) {
                nums[left] = nums[right];
                left++;
                count = 0;
            } else {
                count++;
                if (count < 2 ) {
                    nums[left] = nums[right];
                    left++;
                }
            }
        }
        return left;
    }
}

package lc026;

public class Main {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int length = nums.length;
        for (int right=1; right < length; right++) {
            if (nums[right] != nums[right-1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}

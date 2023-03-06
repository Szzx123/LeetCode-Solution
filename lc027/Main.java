package lc027;

public class Main {
    /**
     * 双指针，不等于val就移给left，不等几次就移动了几次，等于不是val的元素数
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int lfptr = 0;
        int length = nums.length;
        for (int rtptr = 0; rtptr < length; rtptr++) {
            if (nums[rtptr] != val) {
                nums[lfptr] = nums[rtptr];
                lfptr++;
            }
        }
        return lfptr;
    }
}

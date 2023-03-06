package lc088;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);

        for (int num: nums1)
            System.out.println(num);
    }

    /**
     * 使用双指针 在指针未越界时，到底了就让剩下的一直加，开始时就比大小，谁小放谁
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sorted = new int[m+n];
        int p = 0, q = 0;
        int tmp;
        while (p < m || q < n) {
            if (p == m) {
                tmp = nums2[q++];
            } else if (q == n) {
                tmp = nums1[p++];
            } else if (nums1[p] < nums2[q]) {
                tmp = nums1[p++];
            } else {
                tmp = nums2[q++];
            }
            //因为初始值都是0，每次只有一个++1，所以就可以代表下标
            sorted[p+q-1] = tmp;
        }
        if (m + n >= 0) System.arraycopy(sorted, 0, nums1, 0, m + n);
    }
}

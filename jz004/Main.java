package jz004;

public class Main {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int res = search(row, target);
            if (res >= -Integer.MAX_VALUE+1) {
                return true;
            }
        }
        return false;
    }
    public int search ( int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int tmp = nums[mid];
            if (tmp == target) {
                return target;
            } else if (tmp > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -Integer.MAX_VALUE;
    }
}

package jz011;

public class Main {
    public static void main(String[] args) {
        System.out.println(9&1);
    }

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            //需要和右边比较才能保证正确性
            // 1 2 3 4 5
            // 3 4 5 1 2
            //i = 0 j = 4 m = 2
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }
        return numbers[left];
    }
}

package lc009;

public class Main {
    /**
     * 全部进行反转
     * @param args
     */
    public static void main(String[] args) {
        int x = 1001;
        boolean ans = isPalindromeV2(x);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {
        if ( x < 0 || ( x % 10 == 0 && x != 0)) {
            return false;
        }

        int revert = 0;
        int temp = x;
        while ( (temp / 10 > 0) || ( temp % 10 != 0 ) ) {
            revert = temp % 10 + revert * 10;
            temp /= 10;
        }
        return x == revert;
    }

    /**
     * 进行一半反转，多一位的话/10比较，前部分>后部分为取一半条件
     * @param x
     * @return
     */
    public static boolean isPalindromeV2(int x) {
        if ( x < 0 || ( x % 10 == 0 && x != 0)) {
            return false;
        }

        int revert = 0;
        while ( x > revert ) {
            revert = x % 10 + revert * 10;
            x /= 10;
        }
        return x == revert || x == revert / 10 ;
    }

}

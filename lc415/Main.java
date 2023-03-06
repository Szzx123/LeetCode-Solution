package lc415;

public class Main {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String ans = addStrings(num1, num2);
        System.out.println(ans);
    }

    /**
     * 从最后往前数 进行加法 注意进位 最后反转
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while ( i >= 0 || j >= 0 ) {
            int t1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int t2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = t1 + t2 + carry;
            res.append(temp % 10);
            carry = temp / 10;
            i--;
            j--;
        }
        //最后全没了可能还要进1
        if ( carry == 1 ) {
            res.append(1);
        }
        return res.reverse().toString();
    }

}

package lc043;

/**
 * 将下面那个拆开来每一位和第一个乘 注意进位 和0直接出0
 */
public class Main {
    public static void main(String[] args) {
//        String num1 = "123";
//        String num2 = "456";
        String num1 = "9";
        String num2 = "9";
        String ans = multiply(num1, num2);
        System.out.println(ans);
    }
    public static String multiply(String num1, String num2) {
       if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String res = "";
        for ( int j = num2.length() - 1; j >= 0; j-- ) {
            int carry = 0;
            StringBuilder temp = new StringBuilder("");
            temp.append("0".repeat(Math.max(0, num2.length() - 1 - j)));
            int n2 = num2.charAt(j) - '0';
            for ( int i = num1.length() - 1; i >= 0; i-- ) {
                int n1 = num1.charAt(i) - '0';
                int pro = n1 * n2;
                int prot = ( pro + carry ) % 10;
                temp.append(prot);
                carry = ( pro + carry ) / 10;
            }
            //需要注意边界 最后一个有进位要加上
            if ( carry != 0 ) {
                temp.append(carry);
            }
            res = addStrings(res, temp.reverse().toString());
        }
        return res;
    }

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

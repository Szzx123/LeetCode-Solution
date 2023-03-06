package lc014;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * strs[]是一个字符串数组，包含多个字符串。用第一个作为基础的prefix，每次和后面比较时，更新pre，为0了就直接结束
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int num = strs.length;
        for (int i=1; i < num; i++) {
            pre = compareTwoPrefix(pre, strs[i]);
            if (pre.length() == 0) {
                break;
            }
        }
        return pre;
    }
    public String compareTwoPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < len && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str1.substring(0, i);
    }

    /**
     * 纵向比较法
     * @param strs
     * @return
     */

    public String longestCommonPrefixV2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            //每次把要比的str0的那一位取出来
            char c = strs[0].charAt(i);
            //从第二个str开始比，所以j=1
            for (int j = 1; j < count; j++){
                //如果长度比它小一位（因为i是下标，比当前长度小一位）就直接返回子串，或比较结果不一致也返回
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}

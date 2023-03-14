package jz066;

public class Solution {
    public int[] constructArr(int[] a) {
        if (a.length == 0) return new int[] {};
        int[] dpl = new int[a.length];
        int[] dpr = new int[a.length];
        int[] ans = new int[a.length];
        dpl[0] = 1;
        dpr[a.length-1] = 1;
        for (int i = 1; i < a.length; i++) {
            dpl[i] = dpl[i-1] * a[i-1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            dpr[i] = dpr[i+1] * a[i+1];
        }
        for (int i = 0; i < a.length; i++) {
            ans[i] = dpl[i] * dpr[i];
        }
        return ans;
    }
}

package lc904;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0, i = 0;
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int j = 0; j < fruits.length; j++) {
            //先放
            hm.put(fruits[j], hm.getOrDefault(fruits[j], 0)+1);
            //放了看多不多
            while (hm.size() > 2) {
                //先从左边开始减
                hm.put(fruits[i], hm.get(fruits[i])-1);
                if (hm.get(fruits[i]) == 0) {
                    //0了就删掉
                    hm.remove(fruits[i]);
                }
                //每次都要左+1
                i++;
            }
            //不多就算
            res = Math.max(res, j-i+1);
        }
        return res;
    }
}

package lc599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> publicRes = new ArrayList<String>();
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            hashMap.put(list1[i], i);
        }
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (hashMap.containsKey(list2[i])) {
                int j = hashMap.get(list2[i]);
                if (i + j < sum) {
                    publicRes.clear();
                    publicRes.add(list2[i]);
                    sum = i + j;
                } else if (i + j == sum) {
                    publicRes.add(list2[i]);
                }
            }
        }
        return publicRes.toArray(new String[publicRes.size()]);
    }
}

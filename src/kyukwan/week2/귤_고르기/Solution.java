package kyukwan.week2.귤_고르기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> box = new HashMap<>();
        for (int size : tangerine) {
            int cnt = box.getOrDefault(size, 0);
            box.put(size, cnt + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (var cnt : box.values()) {
            list.add(cnt);
        }
        list.sort((a, b) -> b - a);

        int cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            cnt += list.get(i);
            if (k <= cnt) {
                return i + 1;
            }
        }

        return list.size();
    }
}
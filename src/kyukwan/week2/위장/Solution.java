package kyukwan.week2.위장;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        for (String[] str : clothes) {
            List<String> list = map.getOrDefault(str[1], new ArrayList<String>());
            list.add(str[0]);
            map.put(str[1], list);
        }
        int answer = 1;
        for (List<String> list : map.values()) {
            answer *= list.size() + 1;
        }
        return answer - 1;
    }
}
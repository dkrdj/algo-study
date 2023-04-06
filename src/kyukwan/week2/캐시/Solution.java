package kyukwan.week2.캐시;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.remove(city)) {
                cache.add(city);
                answer += 1;
            } else {
                cache.add(city);
                answer += 5;

                if (cacheSize < cache.size()) {
                    cache.remove(0);
                }
            }
        }
        return answer;
    }
}
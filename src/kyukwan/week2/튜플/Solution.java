package kyukwan.week2.튜플;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String s) {
        return Stream.of(s.substring(2, s.length() - 2).replace("},{", " ").split(" "))
                .map(str -> Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray())
                .sorted(Comparator.comparingInt(a -> a.length))
                .flatMapToInt(arr -> Arrays.stream(arr))
                .distinct()
                .toArray();
    }
}

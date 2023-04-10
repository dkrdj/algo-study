package sanghyun.week3.H_Index;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int idx = 0; idx < citations.length; idx++) {
            if (citations[citations.length - 1 - idx] <= idx)
                return idx;
        }
        return citations.length;
    }
}
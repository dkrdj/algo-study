package kyukwan.week2.점프와_순간_이동;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (0 < n) {
            answer += n & 1;
            n /= 2;
        }

        return answer;
    }
}
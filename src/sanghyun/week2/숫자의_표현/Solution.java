package sanghyun.week2.숫자의_표현;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * (i + 1) <= 2 * n; i++) {
            if (i % 2 == 1 && n % i == 0)
                answer++;
            if (i % 2 == 0 && n % i != 0 && n % (i / 2) == 0)
                answer++;
        }
        return answer;
    }
}
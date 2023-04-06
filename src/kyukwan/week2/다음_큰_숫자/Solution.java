package kyukwan.week2.다음_큰_숫자;

class Solution {
    public int solution(int n) {
        int answer = n;
        while (Integer.bitCount(++answer) != Integer.bitCount(n)) ;
        return answer;
    }
}
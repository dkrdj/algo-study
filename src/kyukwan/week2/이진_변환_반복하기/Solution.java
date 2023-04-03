package kyukwan.week2.이진_변환_반복하기;

class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroCnt = 0;
        while (!s.equals("1")) {
            String c = s.replace("0", "");
            zeroCnt += s.length() - c.length();
            s = Integer.toBinaryString(c.length());
            cnt++;
        }
        return new int[]{cnt, zeroCnt};
    }
}
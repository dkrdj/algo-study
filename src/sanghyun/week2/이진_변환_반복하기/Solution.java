package sanghyun.week2.이진_변환_반복하기;

class Solution {
    int convertCount = 0;
    int deleteCount = 0;

    public int[] solution(String s) {
        convert(s);
        return new int[]{convertCount, deleteCount};
    }

    public void convert(String s) {
        convertCount++;
        int oneCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                deleteCount++;
                continue;
            }
            oneCount++;
        }
        if (oneCount == 1)
            return;
        convert(Integer.toBinaryString(oneCount));
    }
}
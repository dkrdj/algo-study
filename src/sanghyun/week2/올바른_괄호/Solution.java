package sanghyun.week2.올바른_괄호;

class Solution {
    boolean solution(String s) {
        int count = 0;
        for (char bracket : s.toCharArray()) {
            if (count < 0) return false;
            if (bracket == '(') count++;
            else count--;
        }
        return count == 0;
    }
}
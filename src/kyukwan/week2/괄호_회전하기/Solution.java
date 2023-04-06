package kyukwan.week2.괄호_회전하기;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int length = s.length() - 1;
        for (int i = 0; i < length; i++) {
            if (isRight(s.substring(i, s.length()) + s.substring(0, i))) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isRight(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
                else return false;
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return false;
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
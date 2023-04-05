package sanghyun.week2.짝지어_제거하기;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
                continue;
            }
            stack.pop();
        }
        return stack.size() == 0 ? 1 : 0;
    }
}
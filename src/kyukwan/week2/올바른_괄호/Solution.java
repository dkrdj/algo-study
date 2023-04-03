package kyukwan.week2.올바른_괄호;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (var ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }
}
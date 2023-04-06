package kyukwan.week2.짝지어_제거하기;

import java.util.Stack;
import java.util.stream.Collectors;

class Solution {
    public int solution(String s) {
        boolean isChanged = true;
        while (isChanged && 0 < s.length()) {
            isChanged = false;
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek().equals(c)) {
                    stack.pop();
                    isChanged = true;
                } else {
                    stack.push(c);
                }
            }
            s = stack.stream().map(st -> st.toString()).collect(Collectors.joining(""));
        }
        return s.length() == 0 ? 1 : 0;
    }
}
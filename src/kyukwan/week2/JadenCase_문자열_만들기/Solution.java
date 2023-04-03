package kyukwan.week2.JadenCase_문자열_만들기;

class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        boolean isUpper = true;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                isUpper = true;
            } else if (isUpper) {
                ch[i] = Character.toUpperCase(ch[i]);
                isUpper = false;
            } else {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        return new String(ch);
    }
}
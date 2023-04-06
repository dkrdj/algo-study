package kyukwan.week2.영어_끝말잇기;

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        char startLetter = words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            if (startLetter == words[i].charAt(0) && !usedWords.contains(words[i])) {
                usedWords.add(words[i]);
                startLetter = words[i].charAt(words[i].length() - 1);
            } else {
                return new int[]{i % n + 1, i / n + 1};
            }
        }
        return new int[]{0, 0};
    }

}
package kyukwan.week2.연속_부분_수열_합의_개수;
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> answers = new HashSet<>();
        for(int i = 1; i <= elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                int end = i + j;
                int partialSum = 0;
                for(int k = j; k < end; k++){
                    partialSum += elements[k % elements.length];
                }
                answers.add(partialSum);
            }
        }
        return answers.size();
    }
}

class
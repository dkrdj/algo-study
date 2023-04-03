package kyukwan.week2.최솟값_만들기;

import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[B.length - 1 - i];
        }
        return result;
    }
}
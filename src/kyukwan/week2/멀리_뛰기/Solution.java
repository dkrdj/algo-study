package kyukwan.week2.멀리_뛰기;

class Solution {
    public long solution(int n) {
        int[] memoization = new int[n + 1];
        memoization[0] = 1;
        memoization[1] = 1;
        for (int i = 2; i <= n; i++) {
            memoization[i] = (memoization[i - 1] + memoization[i - 2]) % 1234567;
        }
        return memoization[n];
    }
}
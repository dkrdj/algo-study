package kyukwan.week2.n2승배열_자르기;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] arr = new int[(int) (right - left) + 1];

        int index = 0;
        for (long k = left; k <= right; k++) {
            int i = (int) (k / (long) n);
            int j = (int) (k % (long) n);
            arr[index++] = Math.max(i, j) + 1;
        }

        return arr;
    }
}
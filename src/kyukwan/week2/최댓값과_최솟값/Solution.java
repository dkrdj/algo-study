package kyukwan.week2.최댓값과_최솟값;

class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (var number : s.split(" ")) {
            int num = Integer.parseInt(number);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return String.format("%d %d", min, max);
    }
}
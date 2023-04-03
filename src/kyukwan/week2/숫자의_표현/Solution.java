package kyukwan.week2.숫자의_표현;

class Solution {
    public int solution(int n) {
        int result = 0;

        int[] nums = new int[n + 1];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + i;
        }

        int left = 0;
        int right = 1;
        while (left < right && right < nums.length) {
            int sum = nums[right] - nums[left];
            if (sum < n) {
                right++;
            } else if (sum > n) {
                left++;
            } else {
                result++;
                right++;
            }
        }

        return result;
    }
}
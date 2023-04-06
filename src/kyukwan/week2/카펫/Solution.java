package kyukwan.week2.카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        final int area = brown + yellow;
        int horizon = (brown - 2) / 2;
        int vertical = 3;
        while (vertical <= horizon) {
            if (vertical * horizon == area) {
                return new int[]{horizon, vertical};
            }
            vertical++;
            horizon--;
        }
        return null;
    }
}
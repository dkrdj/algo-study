package kyukwan.week2.예상_대진표;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int left = a - 1;
        int right = b - 1;

        int round = 0;
        while(left != right){
            left /= 2;
            right /= 2;
            round++;
        }

        return round;
    }

}
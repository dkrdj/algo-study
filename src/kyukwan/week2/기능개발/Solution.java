package kyukwan.week2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int task = 100 - progresses[i];
            int moreTime = (task % speeds[i]) > 0 ? 1 : 0;
            q.offer(task / speeds[i] + moreTime);
        }

        int cnt = 0;
        int max = q.peek();
        List<Integer> answers = new ArrayList<>();
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (max < cur) {
                max = cur;
                answers.add(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        answers.add(cnt);
        return answers.stream().mapToInt(num -> num).toArray();
    }
}
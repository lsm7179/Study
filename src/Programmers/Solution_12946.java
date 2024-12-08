package Programmers;

import java.util.ArrayList;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12946
// 어렵네 이해하기..
public class Solution_12946 {
    private List<int[]> answerList;

    public int[][] solution(int n) {
        answerList = new ArrayList<>();
        HanoiTower(n, 1, 2, 3);

        return answerList.toArray(int[][]::new);


    }

    public void HanoiTower(int n, int start, int middle, int target) {
        if (n == 1) {
            answerList.add(new int[]{start, target});
            return;
        }
        HanoiTower(n - 1, start, target, middle);
        answerList.add(new int[]{start, target});
        HanoiTower(n - 1, middle, start, target);
    }

}

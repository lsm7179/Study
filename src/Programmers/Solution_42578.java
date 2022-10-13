package Programmers;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Solution_42578 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }

        for(String key : map.keySet()) {
            answer *=(map.get(key)+1);
        }

        return answer-1;
    }
}

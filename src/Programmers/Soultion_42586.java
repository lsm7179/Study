package Programmers;
import java.util.*;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
public class Soultion_42586 {

    public static void main(String[] args) {
        int[] solution = solution(new int[]{99, 99, 99, 90, 90, 90}, new int[]{1,1,1,1,1,1});

        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> results = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        while (!queue.isEmpty()){
            int day = queue.poll();
            int cnt = 1;

            while(!queue.isEmpty() && day >= queue.peek()){
                cnt++;
                queue.poll();
            }
            results.add(cnt);
        }

        return results.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}

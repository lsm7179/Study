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
        int result = 0;
        int day = 0;
        Queue<Integer> progressesQueue = new LinkedList<>();
        Queue<Integer> speedsQueue = new LinkedList<>();

        // 스택에 넣는다.
        for(int i =0; i< progresses.length; i++){
            progressesQueue.add(progresses[i]);
            speedsQueue.add(speeds[i]);
        }

        while(!progressesQueue.isEmpty()){
            // 스택에서 빼서 speeds를 추가하여 100%가 되게한다.(이때 int day로 날짜를 확인한다. 그다음 result +1한다.)
            int progress = progressesQueue.poll();
            int speed = speedsQueue.poll();

            if(day == 0){
                day = (100 - progress)/speed;
                result++;
                // 다음 스택에서 day와 speed를 합쳐서 100%가 넘으면 result++ 한다.
            }else if(progress + (day * speed) >= 100) {
                result++;
            }else {
                // 100%가 안되면
                // result 를 list에 담고 result를 초기화한다.
                results.add(result);
                result = 1;

                //day를 계산해야함.
                day += (100 - (progress + day * speed)) /speed;
            }

        }
        // stack이 끝나면 마지막 result를 넣는다.
        results.add(result);



        int[] answer = {};
        return results.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

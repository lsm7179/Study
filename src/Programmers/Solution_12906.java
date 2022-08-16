package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Solution_12906 {
    public static int[] solution(int []arr) {
        List<Integer> answers =new ArrayList<>();

        int answerCount = 0;

        for(int i = 0; i< arr.length;i++ ){
            if(answerCount == 0){
                answers.add(arr[i]);
                answerCount++;
            } else {
                if(answers.get(answerCount-1) != arr[i]) {
                    answers.add(arr[i]);
                    answerCount++;
                }
            }

        }
        return answers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(solution(arr1)));
    }
}

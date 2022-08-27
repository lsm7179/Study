package Programmers;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=java#
public class Solution_42862 {

    public static void main(String[] args) {
        //4, [2, 3], [3, 4]
        System.out.println(solution(4, new int[]{2,3}, new int[]{3,4}));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        // 전체 학생의 수는 2명 ~ 30명
        // 도난당한 학생의 수  1명 이상 n명 이하

        /*
        일단 본인이 도난당하면 여벌이 있어도 의미없음.
        그러면 양쪽에 끼여있을때 최대한 많이 빌릴수있는 경우를 찾아보자
        도난 x 여벌이 o
        2가지 패턴으로 볼수 있다.
         도난당한 학생을 찾고 본인이 여벌이 있는지 확인
         그게 아니라면
        왼쪽부터 확인해서 카운트 없으면 오른쪽 확인해서 카운트

        reserve를 -1 으로 만들어 초기화 한다.
        */
        Arrays.sort(lost);
        Arrays.sort(reserve);
        n = n - lost.length;

        for(int i =0; i< lost.length;i++) {
            for(int j =0; j < reserve.length;j++) {
                if(lost[i] == reserve[j]) {
                    n++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for(int i =0; i< lost.length;i++) {
            for(int j =0; j < reserve.length;j++) {
                if(reserve[j] == lost[i]-1) {
                    n++;
                    reserve[j] = -1;
                    break;
                }else if(reserve[j] == lost[i]+1) {
                    n++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return n;
    }
}

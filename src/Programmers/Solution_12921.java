package Programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Solution_12921 {

    public static void main(String[] args) {

    }

    public int solution(int n) {
        int answer = 0;
        if(n<2) return 0;

        for (int j = 2; j <= n; j++) {
            boolean 소수 = true;
            for(int i=2; i <= Math.sqrt(j); i++) {
                if(j % i == 0) {
                    소수 = false;
                    break;
                }
            }
            if(소수) {
                answer += 1;
            }
        }
        return answer;
    }
}

package Programmers;

public class Solution_12900 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/12900
    /*
    가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다.
    이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다.
    타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.
    타일을 가로로 배치 하는 경우
    타일을 세로로 배치 하는 경우
    예를들어서 n이 7인 직사각형은 다음과 같이 채울 수 있습니다.
    * */
    public static void main(String[] args) {
        // 1 2 3 4 5
        // 1 2 3 5 8
        int result = solution(5);
        System.out.println(result);
    }
    public static int solution(int n) {
        //n을 2와 1로 조합 가능한 경우의수를 구하는것
        int[] results = new int[n];
        results[0] = 1;
        results[1] = 2;
        for (int i = 2; i <results.length; i++) {
            results[i] = (results[i-1] + results[i-2]) % 1_000_000_007;
        }
        return results[n-1];
    }

}

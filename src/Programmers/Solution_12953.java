package Programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Solution_12953 {

    public int solution(int[] arr) {
        int totalLcm = 0;
        if(arr.length == 1) {
            return arr[0];
        }
        totalLcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            totalLcm = lcm(totalLcm, arr[i]);
        }
        return totalLcm;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

package Programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12907 거스름돈
public class Solution_12907 {
    private static final long INF = 1000000007;

    public static int solution(int n, int[] money) {
        int[] DP = new int[n + 1];
        for (int i = 0; i < money.length; i++) {
            int cur = money[i];
            if (cur > n) continue;
            DP[cur]++;
            for (int j = 1; j <= n; j++) {
                if (j - cur >= 0) {
                    DP[j] += DP[j - cur];
                    DP[j] %= INF;
                }
            }
        }
        return DP[n];
    }
}

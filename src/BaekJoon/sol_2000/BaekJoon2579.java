package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n + 1];
        int[] maxScore = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        if (n >= 1)
            maxScore[1] = stairs[1];
        if (n >= 2)
            maxScore[2] = stairs[1] + stairs[2];
        if (n >= 3)
            maxScore[3] = Integer.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);
        for (int i = 4; i <= n; i++) {
            maxScore[i] = Integer.max(maxScore[i - 3] + stairs[i - 1] + stairs[i], maxScore[i - 2] + stairs[i]);
        }
        System.out.print(maxScore[n]);
    }
}
package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1932 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int point[][] = new int[n][n];
        int maxPoint[][] = new int[n][n];
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer strTok = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <= i; j++) {
                point[i][j] = Integer.parseInt(strTok.nextToken());
            }
        }
        maxPoint[0][0] = point[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    maxPoint[i][j] = maxPoint[i - 1][j] + point[i][j];
                else if (j == i)
                    maxPoint[i][j] = maxPoint[i - 1][j - 1] + point[i][j];
                else
                    maxPoint[i][j] = Integer.max(maxPoint[i - 1][j - 1], maxPoint[i - 1][j]) + point[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            result = Integer.max(result, maxPoint[n - 1][i]);
        }
        System.out.print(result);
    }
}

/**
 *     7                             7                                  00
 *    3 8                       3+7     8+7                           10  11
 *   8 1 0             8+(3+7)    1+(8+7)    0+(8+7)                20  21  22
 *  2 7 4 4   2+(8+(3+7))  5+(8+(3+7))  4+(1+(8+7))  4+(0+(8+7))  30  31  32  33
 * */
package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2163 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(br.readLine()," ");
        long n = Integer.parseInt(strToken.nextToken());
        long m = Integer.parseInt(strToken.nextToken());
        System.out.print(n * m - 1);
    }

}
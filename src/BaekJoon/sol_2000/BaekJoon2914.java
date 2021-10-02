package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2914 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(br.readLine()," ");
        int a= Integer.parseInt(strToken.nextToken());
        int b= Integer.parseInt(strToken.nextToken());
        System.out.print(a*(b-1)+1);
    }

}
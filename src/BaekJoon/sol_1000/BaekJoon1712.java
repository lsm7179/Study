package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1712 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(br.readLine()," ");
        long a = Integer.parseInt(strToken.nextToken());
        long b = Integer.parseInt(strToken.nextToken());
        long c = Integer.parseInt(strToken.nextToken());
        if(c-b<=0){
            System.out.println(-1);
            System.exit(0);
        }
        long result = a/(c-b)+1;
        System.out.println(result);
    }

}
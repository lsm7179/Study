package BaekJoon.sol_3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon3046 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int r1=Integer.parseInt(input[0]);
        int s=Integer.parseInt(input[1]);
        int r2=s*2-r1;
        System.out.print(r2);
    }

}
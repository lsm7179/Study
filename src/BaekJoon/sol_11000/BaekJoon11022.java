package BaekJoon.sol_11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11022 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            StringTokenizer strToken=new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt(strToken.nextToken());
            int b=Integer.parseInt(strToken.nextToken());
            sb.append("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        System.out.println(sb);
    }
}
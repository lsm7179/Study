package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2908 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
        int a=Integer.parseInt(strTok.nextToken());
        int b=Integer.parseInt(strTok.nextToken());

        int sa=a%10*100+a%100-a%10+a/100;
        int sb=b%10*100+b%100-b%10+b/100;

        if(sa>sb) System.out.print(sa);
        else System.out.print(sb);
    }
}

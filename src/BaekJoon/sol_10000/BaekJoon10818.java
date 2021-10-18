package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10818 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int testCase=Integer.parseInt(br.readLine());
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<testCase;i++){
           int number=Integer.parseInt(strTok.nextToken());
           min=Integer.min(number,min);
           max=Integer.max(number,max);
        }
        System.out.print(min+" "+max);
    }
}

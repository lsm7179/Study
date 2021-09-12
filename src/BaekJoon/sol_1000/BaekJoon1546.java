package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1546 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
        int max=0;
        int []score=new int[n];
        double tot=0.0;
        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(strTok.nextToken());
            max=Integer.max(max,score[i]);
            tot+=score[i];
        }

        System.out.print((tot/max)*100/n);
    }
}

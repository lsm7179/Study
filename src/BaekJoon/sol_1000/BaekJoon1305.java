package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1305 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int L=Integer.parseInt(br.readLine());
        String pattern=br.readLine();

        int Pi[]=getPi(pattern);
        System.out.println(L-Pi[L-1]);

    }

    static int[] getPi(String pattern){//KMP 알고리즘
        int length=pattern.length();
        int[] pi=new int[length];
        int j=0;
        for(int i=1;i<length;i++){
            while(j>0&&pattern.charAt(i)!=pattern.charAt(j)){
                j=pi[j-1];
            }
            if(pattern.charAt(i)==pattern.charAt(j)){
                pi[i]=++j;
            }
        }
        return pi;
    }

}
package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10870 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        each(0,1,n);

    }

    public static void each(int i,int j,int n){
        if(n==0){
            System.out.print(i);
            System.exit(0);
        }
        n--;
        each(j,i+j,n);

    }

}

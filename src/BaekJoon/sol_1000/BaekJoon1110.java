package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1110 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int oldNo=n;
        int count=0;
        while(true){

            n=(n%10)*10+((n/10)+n%10)%10;

            count++;
            if(oldNo==n){
                break;
            }

        }
        System.out.println(count);

    }




}
package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1075 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int f = Integer.parseInt(br.readLine());
        n-=n%100;
        long result = n%f==0 ? n : (n/f+1)*f;
        result= result%100;
        if(result>=10){
            System.out.print(result);
        }else{
            System.out.print("0"+result);
        }
    }
}
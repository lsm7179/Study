package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon6749 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        System.out.print(m+(m-n));
    }

}
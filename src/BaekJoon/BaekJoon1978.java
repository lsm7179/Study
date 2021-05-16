package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1978 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer strToken=new StringTokenizer(br.readLine()," ");
        int result=0;
        for(int i=0;i<N;i++){
            int a=Integer.parseInt(strToken.nextToken());
            if(primeNumberCount(a)) result++;
        }
        System.out.println(result);
    }

    //소수의 개수 카운트 리턴
    public static boolean primeNumberCount(int number){
        if(number==1) return false;
        if(number==2) return true;
        if(number==3) return true;
        for(int i=2;i<=(number/2);i++){
            if(number%i==0) return false;
        }
        return true;
    }
}

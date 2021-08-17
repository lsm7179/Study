package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1065 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N<99){
            System.out.println(N);
        }else{
            int count=N;
            while(N>=100){
                int no=N;
               //이러면 최소 3자리수
                int size=(int)(Math.log10(no)+1);
                int []arr=new int[size];
                for(int i=0;i<size;i++){
                    arr[i]=no%10;
                    no/=10;
                }
                int diff=0;
                for(int i=0;i<size-1;i++){
                    if(i==0){
                        diff=arr[i]-arr[i+1];
                    }else{
                        if(diff!=arr[i]-arr[i+1]){
                            count--;
                        }
                    }
                }
                N--;
            }
            System.out.println(count);
        }


    }

}
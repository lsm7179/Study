package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken=new StringTokenizer(br.readLine(), " ");
        int N=Integer.parseInt(strToken.nextToken());
        int X=Integer.parseInt(strToken.nextToken());
        StringTokenizer strTokenA=new StringTokenizer(br.readLine(), " ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            int a=Integer.parseInt(strTokenA.nextToken());
            if(X>a) sb.append(a+" ");
        }
        System.out.println(sb);
    }
}
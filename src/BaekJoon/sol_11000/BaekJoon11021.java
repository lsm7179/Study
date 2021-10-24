package BaekJoon.sol_11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11021 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N;i++){
            StringTokenizer strToken=new StringTokenizer(br.readLine(), " ");
            sb.append("Case #"+(i+1)+": "+(Integer.parseInt(strToken.nextToken())+Integer.parseInt(strToken.nextToken()))+"\n");
        }
        System.out.println(sb);
    }
}
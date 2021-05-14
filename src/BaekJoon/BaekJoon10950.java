package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10950 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            String [] input=br.readLine().split(" ");
           int input1=Integer.parseInt(input[0]);
           int input2=Integer.parseInt(input[1]);
           sb.append(input1+input2+"\n");
        }
        System.out.println(sb);
    }
}
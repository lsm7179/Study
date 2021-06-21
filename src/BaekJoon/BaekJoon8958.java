package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon8958 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int testCase=Integer.parseInt(br.readLine());
        for(int i=0;i<testCase;i++){
            String test=br.readLine();
            int total=0;
            int score=0;
            for(int j=0;j<test.length();j++){
                if(test.charAt(j)=='O'){
                    score++;
                    total+=score;
                }else{
                    score=0;
                }
            }
            sb.append(total+"\n");
        }
        System.out.print(sb.toString());
    }
}

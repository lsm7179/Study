package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1157 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String test=br.readLine().toUpperCase();
        int max=0;
        int count=0;
        int word[]=new int[26];
        char result = '?';
        for(int i=0;i<test.length();i++){
            word[test.charAt(i)-65]++;
            max=Integer.max(max,word[test.charAt(i)-65]);
        }
        for(int i=0;i<word.length;i++) {
            if(word[i]==max){
                result=(char)(i+65);
                count++;
            }
        }
        if(count>1) System.out.print("?");
        else System.out.print(result);

    }
}

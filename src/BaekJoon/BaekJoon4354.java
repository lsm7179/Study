package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon4354 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String pattern=br.readLine();
        StringBuilder sb=new StringBuilder();
        while(!pattern.equals(".")){
            int pi[]=getPi(pattern);
            if(pattern.length()%(pattern.length()-pi[pattern.length()-1])>0){
                sb.append("1\n");
            }else{
                sb.append(pattern.length()/(pattern.length()-pi[pattern.length()-1])+"\n");
            }

            pattern=br.readLine();
        }
        System.out.print(sb.toString());

    }

    static int[] getPi(String pattern){//KMP 알고리즘
        //문자열 자기자신을 제외한 동일한 Prefix와 Suffix 쌍의 최대길이를 배열로 담는다.
        int length=pattern.length();
        int[] pi=new int[length];
        int j=0;
        for(int i=1;i<length;i++){
            while(j>0&&pattern.charAt(i)!=pattern.charAt(j)){
                j=pi[j-1];
            }
            if(pattern.charAt(i)==pattern.charAt(j)){
                pi[i]=++j;
            }
        }
        return pi;
    }

}
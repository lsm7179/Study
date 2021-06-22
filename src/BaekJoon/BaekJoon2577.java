package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2577 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        //2,147,483,647
        String tot=String.valueOf(a*b*c);
        int []result=new int[10];
        for(int i=0;i<tot.length();i++){
            result[Character.getNumericValue(tot.charAt(i))]++;
        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}

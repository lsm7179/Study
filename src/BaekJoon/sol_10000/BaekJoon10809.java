package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon10809 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String test= br.readLine();
        int []arr=new int[26];//97
        for(int i=0;i<test.length();i++){
            if(arr[test.charAt(i)-97]==0)
            arr[test.charAt(i)-97]=i+1;
        }
        Arrays.stream(arr).forEach(x-> System.out.print((x-1)+" "));
    }
}

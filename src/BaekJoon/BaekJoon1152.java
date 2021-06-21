package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1152 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String test=br.readLine().trim();
        if(test.length()==0){
            System.out.print(0);
            System.exit(0);
        }
        String input[]=test.split(" ");
        System.out.print(input.length);
    }
}

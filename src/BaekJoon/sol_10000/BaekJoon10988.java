package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10988 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();
        for (int i = 0; i < testCase.length()/2; i++) {
            if(testCase.charAt(i)!=testCase.charAt(testCase.length()-1-i)){
                System.out.print(0);
                System.exit(0);
            }
        }
        System.out.print(1);
    }

}
package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10039 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
           sum+=n<40?40:n;
        }
        System.out.print(sum/5);

    }

}
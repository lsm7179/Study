package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2441 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
package BaekJoon.sol_3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon3003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int standard[]={1,1,2,2,2,8};
        int input[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < standard.length; i++) {
            System.out.print(standard[i]-input[i]+" ");
        }

    }

}
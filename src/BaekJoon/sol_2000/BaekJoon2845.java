package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BaekJoon2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[5];
        String []pArea=br.readLine().split(" ");
        int p = Integer.parseInt(pArea[0]);
        int area = Integer.parseInt(pArea[1]);
        int cnt = p * area;
        String [] number=br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(number[i]);
            result[i] = temp - cnt;
        } for (int i : result) {
            System.out.println(i);
        }
    }
}


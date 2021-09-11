package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon2845 {
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
        int[] result = new int[5]; int p = scanner.nextInt();
        int area = scanner.nextInt();
        int cnt = p * area;
        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            result[i] = temp - cnt;
        } for (int i : result) {
            System.out.println(i);
        }
    }
}

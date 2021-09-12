package BaekJoon.sol_1000;

import java.util.Scanner;

public class BaekJoon1182 {
    private static int N;
    private static int S;
    private static int count = 0;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        S = scanner.nextInt();

        scanner.nextLine();
        String input = scanner.nextLine();

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input.split(" ")[i]);
        }

        for (int i = 0; i < N; i++) {
            backtracking(arr[i], i);
        }

        System.out.println(count);
    }

    private static void backtracking(int input, int depth){
        if(depth==N-1&&input==S){
            count++;
        }
        depth++;
        if(depth <N){
            backtracking(input+arr[depth],depth);
            backtracking(input,depth);
        }


    }

}
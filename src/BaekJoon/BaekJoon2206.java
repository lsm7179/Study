package BaekJoon;

import java.util.Scanner;

public class BaekJoon2206 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int m = sc.nextInt();
        boolean input[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            String line= sc.nextLine();
            line.charAt(0);
            line.charAt(1);
            line.charAt(0);
            /*for(int j=0;j<m;j++){
                input[i][j]=line.charAt(j+1)=='0'?true:false;
            }*/

        }

       for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

    }

}
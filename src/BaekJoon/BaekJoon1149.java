package BaekJoon;

import java.util.Scanner;

public class BaekJoon1149 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int color[][]=new int[3][n+1];
        int result[][]=new int[3][n+1];

        for(int i=1;i<=n;i++){
            for(int j=0;j<3;j++){
                color[j][i]=scanner.nextInt();
            }
        }// 초기값 세팅

        result[0][0]=result[1][0]=result[2][0]=color[0][0]=color[1][0]=color[2][0]=0;
        for(int i=1;i<=n;i++){
            result[0][i]=Integer.min(result[1][i-1], result[2][i-1]) + color[0][i];
            result[1][i]=Integer.min(result[0][i-1], result[2][i-1]) + color[1][i];
            result[2][i]=Integer.min(result[0][i-1], result[1][i-1]) + color[2][i];
        }
        System.out.println(Integer.min(result[0][n],Integer.min(result[1][n],result[2][n])));
        scanner.close();
    }

}
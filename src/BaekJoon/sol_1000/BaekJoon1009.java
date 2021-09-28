package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1009 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer strTok = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(strTok.nextToken());
            int b = Integer.parseInt(strTok.nextToken());
            sb.append(dataInfo(a, b) + "\n");
        }
        System.out.print(sb.toString());
    }

    private static int dataInfo(int a, int b) {
        int dataInfo = 1;
        while (a >= 10) {
            a %= 10;
        }
        switch (a) {
            case 0:
                dataInfo = 10;
                break;
            case 1:
                dataInfo = 1;
                break;
            case 2:
                int arr2[]={6,2,4,8};
                dataInfo = arr2[b%4];
                break;
            case 3:
                int arr3[]={1,3,9,7};
                dataInfo = arr3[b%4];
                break;
            case 4:
                int arr4[]={6,4};
                dataInfo = arr4[b%2];
                break;
            case 5:
                dataInfo = 5;
                break;
            case 6:
                dataInfo = 6;
                break;
            case 7:
                int arr7[]={1,7,9,3};
                dataInfo = arr7[b%4];
                break;
            case 8:
                int arr8[]={6,8,4,2};
                dataInfo = arr8[b%4];
                break;
            case 9:
                int arr9[]={1,9};
                dataInfo = arr9[b%2];
                break;
        }
        return dataInfo;
    }


}
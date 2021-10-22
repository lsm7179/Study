package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1924 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        StringTokenizer strToken = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(strToken.nextToken());
        int y = Integer.parseInt(strToken.nextToken());
        int sum = 0;
        for (int i = 0; i < x-1; i++) {
            sum += month[i];
        }
        sum+=y;
        String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        System.out.print(week[sum%7]);
    }
}
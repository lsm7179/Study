package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon5596 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 4; i++) {
            sum1+=Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            sum2+=Integer.parseInt(stringTokenizer.nextToken());
        }
        if(sum1>=sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }
    }

}
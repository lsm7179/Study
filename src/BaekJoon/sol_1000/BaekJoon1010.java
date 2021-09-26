package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/194
public class BaekJoon1010 {

    static int nm[];
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input[]=br.readLine().split(" ");
            nm = toInts(input);
            sb.append(permutation(nm[0],nm[1])+"\n");
        }
        System.out.println(sb.toString());


    }

    private static String permutation(int n, int m) { //순열조합으로 경우의수 구함
        double c = 1;//분자
        for (int i = m; i > m-n; i--) {
            c*=i;
        }
        double p = 1;//분모
        for(int i=n;i>1 ;i--){
            p*=i;
        }
        return String.format("%.0f",c/p);//소숫점 제거
    }


    private static int[] toInts(String[] input) {
        int [] result =new int [input.length];
        for (int i = 0; i < input.length; i++) {
            result[i]=Integer.parseInt(input[i]);
        }
        return result;
    }


}
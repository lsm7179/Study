package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon1929 {
    static List<Integer> primeNumberList;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken=new StringTokenizer(br.readLine(), " ");
        int M=Integer.parseInt(strToken.nextToken());
        int N=Integer.parseInt(strToken.nextToken());
        primeNumberList =new ArrayList<Integer>();
        sb=new StringBuilder();
        primeNumberList.add(2);
        primeNumberList.add(3);

        primeNumberAdd(N);
        printResult(M,N);

    }

    //소수리스트에 추가
    public static void primeNumberAdd(int number){
        for(int i=5;i<=number;i+=2){
            isDivided(i);
        }
    }

    //소수로 나누었을때 떨어지는지 확인
    public static void isDivided(int number){
        int x=(int)Math.sqrt(number);
        for (Integer primeNumber:primeNumberList) {
            if(primeNumber>x){
                primeNumberList.add(number);
                return;
            }
            if(number%primeNumber==0) return; //나누어떨어지면 소수가 아님
        }
    }

    //결과를 출력
    public static void printResult(int M,int N){
        for (Integer primeNumber:primeNumberList) {
            if(M<=primeNumber&&N>=primeNumber) sb.append(primeNumber+"\n");
        }
        System.out.println(sb);
    }
}
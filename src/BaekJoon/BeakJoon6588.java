package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeakJoon6588 {
    static boolean[] isPrimeNumbers=new boolean[1000001];
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        isPrimeNumbers[2]=true;
        getPrimeNumber();

        while (true){
            int testCase=Integer.parseInt(br.readLine());
            boolean isWrong=true;
            if(testCase==0){
                System.out.print(sb.toString());
                return;
            }

            for(int i=3; i<=testCase/2;i+=2){
                if(isPrimeNumbers[i]&&isPrimeNumbers[testCase-i]){
                    sb.append(testCase+" = "+i+" + "+(testCase-i)+"\n");
                    isWrong=false;
                    break;
                }
            }
            if(isWrong) sb.append("Goldbach's conjecture is wrong.\n");

        }
    }

    public static void getPrimeNumber(){
        for(int i=3;i<isPrimeNumbers.length;i+=2){
            isDivided(i);
        }
    }

    public static void isDivided(int number){//소수로 나누었을때 떨어지는지 확인
        int x=(int)Math.sqrt(number);
        for (int i=1;i<number;i++) {
            if(isPrimeNumbers[i]){
                if(i>x){
                    isPrimeNumbers[number]=true;
                    return;
                }
                if(number%i==0) return; //나누어떨어지면 소수가 아님
                }
        }
    }

}


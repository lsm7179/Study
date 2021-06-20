package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon15711 {
    static List<Integer> primeNumberList=new ArrayList<Integer>();
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        primeNumberList.add(2);
        addPrimeNumberList(2000001);
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer strToken=new StringTokenizer(br.readLine()," ");
            long a=Long.parseLong(strToken.nextToken());
            long b=Long.parseLong(strToken.nextToken());
            환상의짝꿍인가요(a+b);
        }
        System.out.print(sb.toString());
    }

    public static void 환상의짝꿍인가요(long num){
        if(num<4){
            sb.append("NO\n");
        }else if(num%2==0){
            sb.append("YES\n");
        }else{
            if(isPrimeNumber(num-2)) sb.append("YES\n");
            else sb.append("NO\n");
        }
    }

    public static boolean isPrimeNumber(long num){
        long x=(long)Math.sqrt(num);
        for (Integer primeNumber:primeNumberList) {
            if(primeNumber>x){
                return true;
            }
            if(num%primeNumber==0) return false; //나누어떨어지면 소수가 아님
        }
        return true;
    }

    public static void isDivided(int number){//소수로 나누었을때 떨어지는지 확인
        int x=(int)Math.sqrt(number);
        for (Integer primeNumber:primeNumberList) {
            if(primeNumber>x){
                primeNumberList.add(number);
                return;
            }
            if(number%primeNumber==0) return; //나누어떨어지면 소수가 아님
        }
    }

    public static void addPrimeNumberList(int number){//소수리스트에 추가
        for(int i=3;i<=number;i+=2){
            isDivided(i);
        }
    }

}


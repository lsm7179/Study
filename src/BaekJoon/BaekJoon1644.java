package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//해당 소수를 구한다. o
//구한 소수를 백트레킹으로 계속 더한다?
//더해서 맞으면 카운트?
public class BaekJoon1644 {
    static List<Integer> primeNumberList=new ArrayList<Integer>();
    static int result=0;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        primeNumberList.add(2);
        primeNumberList.add(3);
        addPrimeNumberList(N);

        int start=0, sum=0,end=0;
        while(true){//3  2 3
            if(sum>=N) sum-=primeNumberList.get(start++);
            else if(end==primeNumberList.size()) break;
            else sum+=primeNumberList.get(end++);

            if(sum==N) result++;
        }

        System.out.println(result);
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
        for(int i=5;i<=number;i+=2){
            isDivided(i);
        }
    }

}

package BaekJoon.sol_3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon3052 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean []chk=new boolean[42];
        int result=0;
        for(int i=0;i<10;i++){
            chk[Integer.parseInt(br.readLine())%42]=true;
        }
        for(int i=0;i<chk.length;i++){
            if(chk[i]) result++;
        }
        System.out.print(result);
    }
}

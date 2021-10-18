package BaekJoon.sol_10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10872 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int tot=1;
        for(int i=1;i<=n;i++){
            tot*=(i);
        }
        System.out.print(tot);

    }

}

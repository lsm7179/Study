package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon1271 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nmStr[]=br.readLine().split(" ");
        BigInteger n=new BigInteger(nmStr[0]);
        BigInteger m=new BigInteger(nmStr[1]);

        System.out.println(n.divide(m));
        System.out.print(n.remainder(m));

    }

}
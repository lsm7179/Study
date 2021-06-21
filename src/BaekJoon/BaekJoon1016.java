package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1016 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer=new StringTokenizer(br.readLine(), " ");
        long min=Long.parseLong(stringTokenizer.nextToken());
        long max=Long.parseLong(stringTokenizer.nextToken());
        int size=(int)(max-min+1);
        boolean [] isSqrt=new boolean[size];

        for(long i=2;i*i<=max;i++){
            long pow=i*i;
            long start=min % pow == 0 ? min /pow : (min/pow)+1;
            for(long j = start; pow * j <= max; j++){
                if(!isSqrt[(int)((j * pow) - min)]){
                    isSqrt[(int)((j * pow) - min)] = true;
                    size--;
                }

            }
        }
        System.out.print(size);
    }
}

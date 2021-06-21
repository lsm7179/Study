package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2475 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=5;
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=Math.pow(Integer.parseInt(strTok.nextToken()),2);
        }
        System.out.print(tot%10);

    }
}

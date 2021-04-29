import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon4153 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer strToken=new StringTokenizer(br.readLine()," ");
            int[] input=new int[3];
            for(int i=0;i<input.length;i++){
                input[i]=Integer.parseInt(strToken.nextToken());
                if(input[0]==0) return;
            }
            Arrays.sort(input);
            System.out.println(checkRightTriangle(input[0],input[1],input[2]));
        }
    }

    public static String checkRightTriangle(int a,int b,int c){
        if((a*a+b*b)==(c*c)) return "right";
        else return "wrong";
    }
}

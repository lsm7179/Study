import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaejKoon6603 {
    static int k;
    static int [] s;
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String testCase="";
        do {
            testCase=br.readLine();
            String [] input=testCase.split(" ");
            k=Integer.parseInt(input[0]);
            s=new int[k];
            for(int i=0;i<k;i++){
                s[i]=Integer.parseInt(input[i+1]);
            } //초기 값 세팅

        }while(!testCase.equals("0"));


    }


    public static void dfs(int line,int count){

    }

    public static void printOutput(String testCase){

        for(int i=0;i<=(k-6);i++) {
            int[] result = new int[6];

            for(int j=0;j<6;j++){
                result[j]=s[i+j];
            }
            printArray(result);
        }

    }


    public static void printArray(int[] result){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length;i++){
            sb.append(result[i]);
            if(i<result.length-1) sb.append(" ");
        }
        System.out.println(sb);
    }

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1037 {
    static int max=0;
    static int min=0;
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");

        for(int i=0;i<N;i++){
            int a=Integer.parseInt(strTok.nextToken());
            if(max<a) max=a;
            if(min>a||min==0) min=a;
        }
        System.out.println(max*min);
    }
}

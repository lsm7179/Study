import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeakJoon11720 {

    public static void main(String[] args) throws Exception {
        int N, result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String number = br.readLine();

        for(int i=0;i<N;i++){
            result+=Integer.parseInt(number.substring(i,i+1));
        }
        System.out.print(result);
    }
}
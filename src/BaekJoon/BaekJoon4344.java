package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon4344 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int score[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double avg = 0.0;
            int sum = 0;
            double count = 0.0;
            for (int j = 1; j <= score[0]; j++) {
                sum += score[j];
            }
            avg = sum / score[0];

            for (int j = 1; j <= score[0]; j++) {
                if (avg < score[j]) count++;
            }
            double per = count / score[0];
            sb.append(String.format("%,.3f", per * 100) + "%\n");

        }
        System.out.println(sb.toString());

    }


}
package Study.coding_test;

//p97 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임이다.
// 예시

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/***
 * 3 3
 * 3 1 2
 * 4 1 4
 * 2 2 2
 *
 * return 2
 *
 * 2 4
 * 7 3 1 8
 * 3 3 3 4
 *
 * return 3
 */
public class 숫자카드게임 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] textNM = br.readLine().split(" ");
        int n = Integer.parseInt(textNM[0]);
        int m = Integer.parseInt(textNM[1]);

        int result = 0;

        for (int i = 0; i < n; i++) {
            int min = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .min().orElseThrow();
            result = Integer.max(result, min);
        }
        System.out.println(result);
    }
}

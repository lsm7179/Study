package Study.coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 입력 예시
 * 5 8 3
 * 2 4 5 4 6
 * */
public class 큰수의법칙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = Arrays.
                stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = input.get(0);
        int m = input.get(1);
        int k = input.get(2);

        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            data.add(Integer.parseInt(br.readLine()));
        }
        

    }
}

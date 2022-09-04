package Study.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://wonit.tistory.com/238
// 그래프 구현하기
public class 가중치가없는그래프 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 4; // 정점의 개수 == 노드 개수
        int m = 5; // 간선의 개수

        //인접 리스트
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //인접 리스트로 구성한 그래프에 ArrayList를 넣어주면서 초기화
        for(int i =0; i<=n;i++){
            graph.add(new ArrayList<>());
        }
        /** 입력 예시
         *	1  2
         *   1  3
         *   1  4
         *   2  4
         *   3  4
         */
        for (int i = 0 ; i< m; i++ ){
            String [] nv = br.readLine().split(" ");
            int n1 = Integer.parseInt(nv[0]);
            int n2 = Integer.parseInt(nv[1]);

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        for (int i = 1; i<=4;i++){
            System.out.println(graph.get(i).toString());
        }

    }
}

package Programmers;

import java.util.*;
// https://school.programmers.co.kr/learn/courses/30/lessons/49189?language=java
/**
 n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다.
 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.

 n	vertex	return
 6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
* */
public class Solution_49189 {
    public int solution(int n, int[][] edge) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i < edge.length;i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        int[] distance = new int[n+1];
        boolean[] visited = new boolean[n + 1];

        visited[1] = true;

        // 탐색 시작
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(1);
        while(!bfs.isEmpty()){
            int nowNode = bfs.poll();
            ArrayList<Integer> node = graph.get(nowNode);
            for(int i =0;i < node.size() ;i++){
                int vertex=node.get(i);
                if(!visited[vertex]){ // 방문하지 않았다면
                    visited[vertex]=true;
                    bfs.add(vertex);
                    distance[vertex]=distance[nowNode] + 1;
                }
            }
        }
        int answer = 0;
        int max = 0;
        for(int i =0; i< distance.length;i++){
            max=Integer.max(max,distance[i]);
        }
        for(int i =0; i< distance.length;i++){
            if(max == distance[i]){
                answer++;
            }
        }
        return answer;
    }
}

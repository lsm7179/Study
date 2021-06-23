package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon1260 {
    static int[][] check = new int[1001][1001]; //좌표를 그대로 받아들이기 위해 +1해서 선언
    static boolean[] visited = new boolean[1001]; //초기값 False
    static int vCount;
    static int start;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input[]=br.readLine().split(" ");
        vCount=Integer.parseInt(input[0]);
        int repeat=Integer.parseInt(input[1]);
        start=Integer.parseInt(input[2]);
        for(int i=0;i<repeat;i++){
            String []node=br.readLine().split(" ");
            int v=Integer.parseInt(node[0]);
            int w=Integer.parseInt(node[1]);
            check[v][w]=1;
            check[w][v]=1;
        } //여기까지 초기화
        dfs(start);

        visited = new boolean[1001]; //확인상태 초기화
        System.out.println(); //줄바꿈

        bfs(start); //bfs호출

    }

    public static void dfs(int n){
        visited[n]=true;
        System.out.print(n+" ");
        for(int i=1;i<=vCount;i++){
            if(check[n][i]==1&&(!visited[i])){
                dfs(i);
            }
        }
    }

    static void bfs(int s){
        visited[s]=true;
        LinkedList<Integer> queue=new LinkedList<>();
        queue.offer(s);
        System.out.print(s + " ");

        while (queue.size()!=0){
            s=queue.poll();
            for(int i=1;i<=vCount;i++){
                if(check[s][i]==1&&(!visited[i])){
                    queue.offer(i);
                    visited[i]=true;
                    System.out.print(i+" ");
                }
            }
        }
    }

}

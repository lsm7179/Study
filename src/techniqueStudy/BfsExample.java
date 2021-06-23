package techniqueStudy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class BfsExample {
    private int V;
    private LinkedList<Integer>[] adj;

    BfsExample(int v){
        this.V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    /*BFS*/
    void BFS(int s){
        boolean visited[]=new boolean[V];//방문여부 확인용 변수
        LinkedList<Integer> queue=new LinkedList<Integer>(); //연결리스트 생성

        visited[s]=true;
        queue.add(s);

        while (queue.size()!=0){
            //방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
            s=queue.poll();
            System.out.print(s+" ");

            //방문한 노드와 인접한 모든 노드를 가져온다.
            Iterator<Integer> i=adj[s].listIterator();
            while (i.hasNext()){
                int n=i.next();

                //방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BfsExample bfsExample=new BfsExample(4);
        bfsExample.addEdge(0,1);
        bfsExample.addEdge(0,2);
        bfsExample.addEdge(0,3);
        bfsExample.addEdge(1,3);
        bfsExample.addEdge(2,3);
        bfsExample.BFS(0);
    }
}

package Study.technique;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsExample {

    private int Node;
    private LinkedList<Integer> adj[];

    DfsExample(int node){
        this.Node = node;
        adj=new LinkedList[node];
        //인접 리스트 초기화화
        for(int i = 0; i< node; i++){
            adj[i]=new LinkedList<>();
        }
   }
   void addEdge(int node, int w){
        adj[node].add(w);
   }

   /*DFS*/
    void DFS(int node){
        boolean visited[]=new boolean[Node];

        //node를 시작 노드로 DFSUtil 재귀 호출
        DFSUtil(node,visited);
    }

    /*DFS에 의해 사용되는 함수 */
    void DFSUtil(int node, boolean visited[]){
        //현재 노드를 방문한 것으로 표시하고 값을 출력
        visited[node]=true;
        System.out.print(node+" ");

        //방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> it=adj[node].listIterator();
        while (it.hasNext()){
            int n=it.next();
            //방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
            if(!visited[n])
                DFSUtil(n,visited);
        }

    }

    public static void main(String[] args) throws Exception{
        DfsExample dfsExample=new DfsExample(4);
        dfsExample.addEdge(0,1);
        dfsExample.addEdge(0,2);
        dfsExample.addEdge(0,3);
        dfsExample.addEdge(1,3);
        dfsExample.addEdge(2,3);
        dfsExample.DFS(0);
    }
}

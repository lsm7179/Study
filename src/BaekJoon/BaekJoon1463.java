package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon1463 {
    static int []isVisited;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        isVisited=new int[n+1];
        System.out.print(bfs(n));
    }

    static int bfs(int n){
        LinkedList<Integer> queue=new LinkedList<Integer>();
        queue.add(n);
        while (!queue.isEmpty()){
            int x=queue.peek();
            queue.poll();
            if(x==1) return isVisited[1];
            if(x%3==0){
                if(isVisited[x/3]==0)isVisited[x/3]=isVisited[x]+1;
                queue.add(x/3);
            }
            if(x%2==0){
                if(isVisited[x/2]==0)isVisited[x/2]=isVisited[x]+1;
                queue.add(x/2);
            }
            if(isVisited[x-1]==0)isVisited[x-1]=isVisited[x]+1;
            queue.add(x-1);

        }
        return isVisited[1];
    }

}

/**
 1로 만들수 있는경우는
 3으로 나눈 몫이 1일때
 2로 나눈 몫이 1일때
 1로 만들수 있는 최소는 2 or 3 이 되어야한다.
 무작위로 해야 최솟값을 구할수 있을거같다.
 10 -> 9 -> 3 -> 1
*/

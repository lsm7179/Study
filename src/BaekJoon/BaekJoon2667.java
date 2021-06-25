package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BaekJoon2667 {

    static boolean [][] visited;
    static int[][] map;
    static int n;

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        visited=new boolean[n][n];
        map=new int [n][n];
        for(int i=0;i<n;i++){
            String[] strMap = br.readLine().split("");
            for(int j=0;j<strMap.length;j++){
                map[i][j]=Integer.parseInt(strMap[j]);
            }
        }
        List<Integer> result=bfs();
        Collections.sort(result);
        System.out.println(result.size());
        for (Integer idx:result) {
            System.out.println(idx);
        }

    }

    static List<Integer> bfs(){
        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    if(map[i][j]==1)
                    list.add(isVisited(i,j));
                    visited[i][j]=true;
                }
            }
        }
        return list;
    }

    static int isVisited(int row,int col){
        LinkedList<Point> queue=new LinkedList<Point>();
        queue.add(new Point(row,col));
        int size=0;
        visited[row][col]=true;
        while(!queue.isEmpty()){
            Point point=queue.poll();
            int x=point.x;
            int y=point.y;
            size++;

            if(x-1>=0&&!visited[x-1][y]&&map[x-1][y]==1){//좌 체크
                queue.add(new Point(x-1,y));
                visited[x-1][y]=true;
            }
            if(x+1<n&&!visited[x+1][y]&&map[x+1][y]==1){//우 체크
                queue.add(new Point(x+1,y));
                visited[x+1][y]=true;
            }
            if(y-1>=0&&!visited[x][y-1]&&map[x][y-1]==1){//상
                queue.add(new Point(x,y-1));
                visited[x][y-1]=true;
            }
            if(y+1<n&&!visited[x][y+1]&&map[x][y+1]==1){//하
                queue.add(new Point(x,y+1));
                visited[x][y+1]=true;
            }
        }
        return size;
    }


    static class Point{
        int x;
        int y;

        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

}

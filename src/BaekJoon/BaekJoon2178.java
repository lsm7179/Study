package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon2178 {
    static int n;
    static int m;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static boolean[][] isVisited;
    static int[][] maze;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(strToken.nextToken());
        m=Integer.parseInt(strToken.nextToken());
        maze=new int[n][m];
        isVisited= new boolean[n][m];
        for(int i=0;i<n;i++){
            String input=br.readLine();
            for(int j=0;j<m;j++){
                maze[i][j]=input.charAt(j)-'0';

            }
        }
        bfs();
        System.out.print(maze[n-1][m-1]);

    }

    static void bfs(){
        LinkedList<Point> queue=new LinkedList<Point>();
        queue.add(new Point(0,0));
        isVisited[0][0]=true;
        while (!queue.isEmpty()){
            Point point=queue.peek();
            queue.poll();
            for(int i=0;i<4;i++){
                int nextX=point.x+dx[i];
                int nextY=point.y+dy[i];
                if(isPossible(nextX,nextY)){
                    if(!isVisited[nextX][nextY]&&maze[nextX][nextY]!=0){
                        isVisited[nextX][nextY]=true;
                        maze[nextX][nextY]=maze[point.x][point.y]+1;
                        queue.add(new Point(nextX,nextY));
                    }
                }
            }
        }
    }
    static boolean isPossible(int nextX,int nextY){
        if(nextX<0||nextX>=n){
            return false;
        }
        if(nextY<0||nextY>=m){
            return false;
        }
        return true;
    }

    static class Point{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}

package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class SkillCheckLevel2_1 {
    int n;
    int m;
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, -1, 0, 1 };
    boolean[][] isVisited;
    public int solution(int[][] maps) {
        int answer = 0;

        n=maps.length;
        m=maps[0].length;
        isVisited= new boolean[n][m];

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
                    if(!isVisited[nextX][nextY]&&maps[nextX][nextY]!=0){
                        isVisited[nextX][nextY]=true;
                        maps[nextX][nextY]=maps[point.x][point.y]+1;
                        queue.add(new Point(nextX,nextY));
                    }
                }
            }
        }

        if(maps[n-1][m-1]==1||maps[n-1][m-1]==0){
            return -1;
        }else{
            return maps[n-1][m-1];
        }
    }


    boolean isPossible(int nextX,int nextY){
        if(nextX<0||nextX>=n){
            return false;
        }
        if(nextY<0||nextY>=m){
            return false;
        }
        return true;
    }

    class Point{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
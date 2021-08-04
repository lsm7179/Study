package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon7576 {
    static int n, m;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] input;
    static int zeroCount=0;
    static int day=-1;
    static Queue<Point> queue=new LinkedList<Point>();
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken=new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(strToken.nextToken());
        m=Integer.parseInt(strToken.nextToken());
        input=new int[n][m];
        for(int i=0;i<m;i++){
            String[] line = br.readLine().split(" ");
            for(int j=0;j<n;j++){
                int no=Integer.parseInt(line[j]);
                if(no==0) zeroCount++;
                if(no==1) queue.add(new Point(j,i,0));
                input[j][i]=no;
            }
        }
        bfs();
        System.out.println(day);
    }
    static void bfs(){
        while (!queue.isEmpty()){
            Point point = queue.poll();
            if(zeroCount<=0){
                day=Integer.max(day,point.day);
            }
            for (int i = 0; i < dx.length; i++) {
                int nextX = point.x+dx[i];
                int nextY = point.y+dy[i];
                if (nextX < 0 || nextY < 0 || nextX > (n-1) || nextY > (m-1)) continue;
                if (input[nextX][nextY] == 0) { // 토마토라면
                    input[nextX][nextY]=1;//토마토를 익히고
                    zeroCount--;
                    queue.add(new Point(nextX,nextY,point.day+1));
                }

            }

        }
    }
    static class Point{
        int x,  y;
        int day=0;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
        Point(int x,int y,int day){
            this(x,y);
            this.day=day;
        }
    }
}
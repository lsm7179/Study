package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon2583 {
    static boolean [][]area;
    static int count=0;
    static int m,n=0;//y,x

    public static void main(String[] args) throws Exception{
        List<Integer> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []mnk=br.readLine().split(" ");
        m=Integer.parseInt(mnk[0]);
        n=Integer.parseInt(mnk[1]);
        int k=Integer.parseInt(mnk[2]);
        area=new boolean[n][m];//x,y
        for(int i=0;i<k;i++){
            int []square= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            createBlock(square);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!area[i][j]){
                    count++;
                    list.add(visited(i,j));
                }
            }
        }
        System.out.println(count);
        Collections.sort(list);
        list.forEach(no->System.out.print(no+" "));
    }

    private static void createBlock(int[] square) {
        for(int i=square[0];i<square[2];i++){
            for(int j=square[1];j<square[3];j++){
                area[i][j]=true;
            }
        }
    }

    private static int visited(int x, int y) {
        int blockCount=0;
        int []dx={0,0,-1,1};
        int []dy={1,-1,0,0};
        Queue<Point> queue=new LinkedList();
        queue.add(new Point(x,y));
        area[x][y]=true;
        while (!queue.isEmpty()){
            Point point=queue.peek();
            queue.poll();
            blockCount++;
            for(int i=0;i<4;i++){
                int nextX=point.x+dx[i];
                int nextY=point.y+dy[i];
                if(nextX<0||nextX>=n||nextY<0||nextY>=m){
                    continue;
                }

                if(!area[nextX][nextY]){
                    area[nextX][nextY]=true;
                    queue.add(new Point(nextX,nextY));
                }
            }
        }
        return blockCount;

    }


    static class Point{
        int x,y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

}
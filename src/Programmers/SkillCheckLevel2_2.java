package Programmers;
import java.util.LinkedList;

public class SkillCheckLevel2_2 {boolean[][] visited;
    int[][] pictureCopy;
    int N;
    int M;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        N=n; M=m;
        visited=new boolean[m][n];
        pictureCopy=picture;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((!visited[i][j])&&picture[i][j]!=0){
                    numberOfArea++;
                    visited[i][j]=true;
                    maxSizeOfOneArea=Integer.max(maxSizeOfOneArea,isVisited(i,j,picture[i][j]));

                }
            }
        }


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    int isVisited(int row,int col,int color){
        LinkedList<Point> queue=new LinkedList<Point>();
        queue.add(new Point(row,col));
        int size=0;
        visited[row][col]=true;
        while(!queue.isEmpty()){
            Point point=queue.poll();
            int x=point.x;
            int y=point.y;
            size++;

            if(x-1>=0&&!visited[x-1][y]&&pictureCopy[x-1][y]==color){//좌 체크
                queue.add(new Point(x-1,y));
                visited[x-1][y]=true;
            }
            if(x+1<M&&!visited[x+1][y]&&pictureCopy[x+1][y]==color){//우 체크
                queue.add(new Point(x+1,y));
                visited[x+1][y]=true;
            }
            if(y-1>=0&&!visited[x][y-1]&&pictureCopy[x][y-1]==color){//상
                queue.add(new Point(x,y-1));
                visited[x][y-1]=true;
            }
            if(y+1<N&&!visited[x][y+1]&&pictureCopy[x][y+1]==color){//하
                queue.add(new Point(x,y+1));
                visited[x][y+1]=true;
            }
        }
        return size;
    }

    class Point{
        int x;
        int y;

        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
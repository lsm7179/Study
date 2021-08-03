package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//https://velog.io/@leeinae/Algorithm-%EB%B0%B1%EC%A4%802206-%EB%B2%BD-%EB%B6%80%EC%88%98%EA%B3%A0-%EC%9D%B4%EB%8F%99%ED%95%98%EA%B8%B0-java
public class BaekJoon2206 {
    static int n, m;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] input;
    static boolean[][][] visited;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(strToken.nextToken());
        m = Integer.parseInt(strToken.nextToken());
        input = new int[n][m];
        visited=new boolean[n][m][2];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                input[i][j] = Integer.parseInt(line[j]);
            }
        }

        bfs(0, 0);
    }

    static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(new Point(x, y, 1));
        visited[x][y][0] = true;
        visited[x][y][1] = true;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.x == (n - 1) && point.y == (m - 1)) { //결과값 도출
                System.out.println(point.count);
                return;
            }
            for (int i = 0; i < dx.length; i++) {
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];
                if (nextX < 0 || nextY < 0 || nextX > (n-1) || nextY > (m-1)) continue;

                if (input[nextX][nextY] == 1) { // 벽이라면
                    if(!visited[nextX][nextY][1]&&point.breakWall==0){ //방문한적이 없고 벽을 부신적이 없다면
                        visited[nextX][nextY][1]=true;
                        queue.add(new Point(nextX,nextY, point.count+1,1));
                    }
                }else{ // 벽이 아니라면
                    if(!visited[nextX][nextY][point.breakWall]) {
                        queue.add(new Point(nextX, nextY, point.count + 1,point.breakWall));
                        visited[nextX][nextY][point.breakWall] = true;
                    }
                }

            }
        }
        System.out.println(-1);
    }

    static class Point {
        int x;
        int y;
        int count;
        int breakWall;//벽돌 부숨

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }

        public Point(int x, int y, int count, int breakWall) {
            this(x,y,count);
            this.breakWall=breakWall;
        }


    }

}
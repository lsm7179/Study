package Programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
// 게임 맵 최단거리
public class Solution_1844 {
    static int answer = 0;

    //백트래킹으로 풀어야될듯함.
    public static void main(String[] args) {
        int[][] test = {{1, 1}, {1, 1}};
        int[][] test2 = {{1}, {1}};
        // System.out.println(solution(test)); // 3
        // System.out.println(solution(test2)); //2
        System.out.println(solution2(test));
        System.out.println(solution2(test2));
    }

    public static int solution(int[][] maps) {

        pathFinder(maps, 1, 0, 0);
        if (answer == 0) {
            return -1;
        }
        return answer;
    }

    public static void pathFinder(int[][] maps, int step, int x, int y) {

        if (maps[x][y] == 1 && x == maps.length - 1 && y == maps[x].length - 1) {
            if (answer == 0) {
                answer = step;
                return;
            }
            answer = Math.min(step, answer);
            return;
        }
        maps[x][y] = 0;// 지나간길은 0으로 수정
        if (x < maps.length - 1 && maps[x + 1][y] == 1) {
            // maps[x+1][y]
            pathFinder(maps, step + 1, x + 1, y);
        }
        if (y < maps[x].length - 1 && maps[x][y + 1] == 1) {
            // maps[x][y + 1]
            pathFinder(maps, step + 1, x, y + 1);
        }
        if (x > 0 && maps[x - 1][y] == 1) {
            // maps[x - 1][y]
            pathFinder(maps, step + 1, x - 1, y);
        }
        if (y > 0 && maps[x][y - 1] == 1) {
            // maps[x][y - 1]
            pathFinder(maps, step + 1, x, y - 1);
        }


    }


    public static int solution2(int[][] maps) {
        int answer = -1;

        if (maps[0][0] == 0) {
            return answer;
        }

        int xLen = maps.length;
        int yLen = maps[0].length;

        int[][] distance = new int[xLen][yLen];
        boolean[][] visited = new boolean[xLen][yLen];

        int[] X = new int[]{-1, 0, 1, 0};
        int[] Y = new int[]{0, -1, 0, 1};

        int[] first = new int[]{0, 0};
        Queue<int[]> que = new LinkedList<>();
        que.offer(first);
        visited[0][0] = true;
        distance[0][0] = 1;

        while (!que.isEmpty()) {

            int[] now = que.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nX = x + X[i];
                int nY = y + Y[i];

                if (nX < 0 || nX >= xLen || nY < 0 || nY >= yLen) continue;
                if (visited[nX][nY]) continue;
                if (maps[nX][nY] == 0) continue;

                int[] next = new int[]{nX, nY};
                distance[nX][nY] = distance[x][y] + 1;
                visited[nX][nY] = true;
                que.offer(next);

            }

            if (x == xLen - 1 && y == yLen - 1){
                return distance[x][y];
            }

        }

        return answer;
    }
}

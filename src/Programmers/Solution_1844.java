package Programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/1844?language=java
// 게임 맵 최단거리
public class Solution_1844 {
    static int answer = 0;

    //백트래킹으로 풀어야될듯함.
    // https://houcouonchi.tistory.com/13 이걸 보고 해결해보기.
    public static void main(String[] args) {
        int[][] test = {{1, 1}, {1, 1}};
        int[][] test2 = {{1}, {1}};
        System.out.println(solution(test)); // 3
        System.out.println(solution(test2)); //2
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
}

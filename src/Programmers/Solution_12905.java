package Programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/12905
// 가장 큰 정사각형 찾기
public class Solution_12905 {

    public static void main(String[] args) {
        int[][] test1 = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int[][] test2 = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] test3 = {{1}};
        System.out.println(solution(test1)); // 9
        System.out.println(solution(test2)); // 1
        System.out.println(solution(test3)); // 1

    }

    public static int solution(int[][] board) {
        int answer = 0;
        if(board.length == 1 && board[0][0] == 1) {
            return 1;
        }
        for (int i = 0; i < board.length - 1; i++) {
            for (int j = 0; j < board[i].length - 1; j++) {
                int nextNumber = Math.min(Math.min(board[i][j], board[i][j + 1]), board[i + 1][j]) + 1;
                if (board[i + 1][j + 1] > 0 ) {
                    board[i + 1][j + 1] = nextNumber ;
                }
                answer = Math.max(answer, Math.max(board[i][j], board[i + 1][j + 1]));
            }
        }

        return answer * answer;
    }
}

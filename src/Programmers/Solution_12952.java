package Programmers;

import java.util.ArrayList;
import java.util.List;
// https://school.programmers.co.kr/learn/courses/30/lessons/12952?language=java
public class Solution_12952 {
    public int solution(int n) {

        return solveNQueens(n).size();
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] board = new int[n]; // 각 행(row)에 놓인 퀸의 열(column)을 기록

        backtrack(result, board, 0, n);
        return result;
    }

    private static void backtrack(List<List<String>> result, int[] board, int row, int n) {
        if (row == n) {
            // 모든 퀸을 배치한 경우, 결과에 추가
            result.add(generateBoard(board, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row] = col; // 퀸 배치
                backtrack(result, board, row + 1, n); // 다음 행으로 이동
                board[row] = -1; // 백트래킹
            }
        }
    }

    private static boolean isValid(int[] board, int currentRow, int col) {
        for (int prevRow = 0; prevRow < currentRow; prevRow++) {
            if (board[prevRow] == col || // 같은 열에 퀸이 있는 경우
                    Math.abs(currentRow - prevRow) == Math.abs(col - board[prevRow])) { // 대각선에 퀸이 있는 경우
                return false;
            }
        }
        return true;
    }

    private static List<String> generateBoard(int[] board, int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = (board[i] == j) ? 'Q' : '.';
            }
            result.add(new String(row));
        }
        return result;
    }
}

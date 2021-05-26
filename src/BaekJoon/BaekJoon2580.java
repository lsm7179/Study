package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2580 {
    static int[][] sudoku;
    static BufferedReader br;
    public static void main(String[] args) throws Exception {
        br=new BufferedReader(new InputStreamReader(System.in));
        sudoku=new int[9][9]; //row , column
        initSudoku();
        backTracking(0,0);

    }

    static void backTracking(int row, int col){
        if(col==9){
            backTracking(row+1,0);
            return;
        }
        if(row==9){
            printSudoku();//출력 후 종료
        }

        if(sudoku[row][col]==0){
            for(int i=1;i<10;i++){
                if(isPossible(row,col,i)){
                    sudoku[row][col]=i;
                    backTracking(row,col+1);
                }
            }
            sudoku[row][col]=0;
            return;
        }
        backTracking(row,col+1);
    }

    static boolean isPossible(int row, int col,int value){

        for(int i=0;i<9;i++){
            if(sudoku[row][i]==value) return false; //가로
            if(sudoku[i][col]==value) return false; //세로
        }

        int setSquareRow=row/3;
        int setSquareCol=col/3;

        for(int i=setSquareRow*3;i<setSquareRow*3+3;i++) {//사각형 안
            for (int j = setSquareCol*3; j < setSquareCol*3+3; j++) {
                if(sudoku[i][j]==value) return false;
            }
        }
        return true;
    }

    static void initSudoku() throws Exception{
        for(int i=0;i<9;i++){
            StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9;j++){
                sudoku[i][j]=Integer.parseInt(strTok.nextToken());
            }
        }
    }

    static void printSudoku(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                sb.append(sudoku[i][j]);
                if(j<8) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        System.exit(0);
    }
}
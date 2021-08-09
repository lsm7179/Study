package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/83201
public class Solution_83201 {
    public static void main(String[] args) {
        int [][]scores={{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        System.out.println(solution(scores));
    }
    public static String solution(int[][] scores) {

        System.out.println(scores.length);

        String answer = "";
        return answer;
    }

    public static String getGrade(double score){
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "B";
        }else if(score>=60){
            return "B";
        }else{
            return "F";
        }
    }

}
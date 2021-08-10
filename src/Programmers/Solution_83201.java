package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/83201
public class Solution_83201 {
    public static void main(String[] args) {
        //[[75, 50, 100], [75, 100, 20], [100, 100, 20]] -> BBF
        int [][]scores={{75,50,100},{75,100,20},{100, 100, 20}};
        System.out.println(solution(scores));
    }
    public static String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<scores.length;i++){
            int max=scores[i][i];
            int min=scores[i][i];
            int tot=0;
            boolean unique=true;
            for(int j=0;j<scores.length;j++){
                if(i!=j&&unique){
                    if(scores[i][i]==scores[j][i]) unique=false;
                    max=Integer.max(max,scores[j][i]);
                    min=Integer.min(min,scores[j][i]);
                }
                tot+=scores[j][i];
            }
            if(scores[i][i]==max&&unique){
                answer.append(getGrade((tot-max)/(scores.length-1)));
            }else if(scores[i][i]==min&&unique){
                answer.append(getGrade((tot-min)/(scores.length-1)));
            }else{
                answer.append(getGrade((tot)/(scores.length)));

            }
        }

        return answer.toString();
    }

    public static String getGrade(double score){
        if(score>=90){
            return "A";
        }else if(score>=80){
            return "B";
        }else if(score>=70){
            return "C";
        }else if(score>=50){
            return "D";
        }else{
            return "F";
        }
    }

}
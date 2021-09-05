package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12918
public class Solution_12918 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6) answer = false;
        if(answer){

            for(int i=0;i<s.length();i++){
                if(!('0'<=s.charAt(i)&&'9'>=s.charAt(i))){
                    return false;
                }
            }
        }
        return answer;
    }
}

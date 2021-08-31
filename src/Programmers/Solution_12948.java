package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12948
public class Solution_12948 {

    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        String [] phone_numbers=phone_number.split("");
        for(int i=0;i<phone_numbers.length-4;i++){
            answer.append("*");
        }
        for(int i=phone_numbers.length-4;i<phone_numbers.length;i++){
            answer.append(phone_numbers[i]);
        }

        return answer.toString();

    }
}

package Programmers;
import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/12899#
public class Solution_12899 {
    public String solution(int n) {
        String answer = "";
        Stack stack=new Stack();
        while(n>0){
            int temp=n%3;
            if(temp==0){
                stack.push(4);
                n=n/3-1;
            }else{
                stack.push(temp);
                n/=3;
            }
        }
        while(!stack.isEmpty()){
            answer+=stack.peek();
            stack.pop();
        }
        return answer;
    }
}

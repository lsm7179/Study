package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/82612
public class Solution_82612 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long fee=factorial(price,count);
        if((long)money>=fee){
            return 0;
        }else{
            answer=fee-money;
        }
        return answer;
    }

    public long factorial(int price, int count){
        long result=0;
        for(int i=0;i<count;i++){
            result+=price*(i+1);
        }
        return result;
    }
}
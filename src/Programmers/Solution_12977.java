package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12977
public class Solution_12977 {
    public int solution(int[] nums) {
        int answer=0;
        for(int i=0;i<nums.length-2;i++)
            for(int j=i+1;j<nums.length-1;j++)
                for(int k=j+1;k<nums.length;k++)
                {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) answer++;
                }
        return answer;
    }

    boolean isPrime(int number){
        if(number < 2) return false;
        for(int i=2;i<=Math.sqrt(number);i++) if(number % i == 0) return false;
        return true;
    }
}

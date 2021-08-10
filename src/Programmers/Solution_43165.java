package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/43165
class Solution_43165 {
    public int solution(int[] numbers, int target) {
        return bfs(numbers, target, numbers[0], 1) + bfs(numbers, target, -numbers[0], 1);
    }

    public int bfs(int[] numbers, int target,int sum,int index){

        if(index==numbers.length){
            if(target==sum) return 1;
            else return 0;
        }
        int result=0;
        result += bfs(numbers, target, sum+numbers[index], index+1);
        result += bfs(numbers, target, sum-numbers[index], index+1);
        return result;
    }
}


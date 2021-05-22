package Programmers;

public class MonthlyCodeChallengeSeason2_2_2 {

    public static void main(String[] args) {
        long [] numbers={2,7,13,3,9};
        // return 값 3,11,14,5,10
        solution(numbers);
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i]=check(numbers[i]);
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static Long check(long number){
        long result=number;
        if(number%2==0){//짝수 제일 낮은 0을 1로 바꾸면 끝 짝수는 무조건 제일 낮은 0이 맨 끝일수밖에없음
            result+=1;
        }else{//홀수
            /* 제일 낮은 0을 1로 바꾸고
               그 보다 낮으면서 제일 높은 자리의 1을 0으로 바꿔야함.*/
            int count=0;
            while(number!=0){
                count++;
                if(number%2==0) break;
                number=number/2;
            }
            if(number!=0)
            result+=(Math.pow(2,count-1)-Math.pow(2,count-2));
            else result+=(Math.pow(2,count)-Math.pow(2,count-1));
        }
        return result;
    }

}

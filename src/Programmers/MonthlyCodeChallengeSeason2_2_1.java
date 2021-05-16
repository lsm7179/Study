package Programmers;

public class MonthlyCodeChallengeSeason2_2_1 {
    public static void main(String[] args) {

    }

    public static int solution(int left, int right) {

        int answer = 0;
        for(int i=left;i<=right;i++){
            answer+=countChk(i);
        }
        return answer;
    }

    public static int countChk(int n) {
        int cnt=0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                if (i * i < n) {
                    cnt++;
                }
            }
        }
        if(cnt%2==1){
            n*=-1;
        }
        return n;
    }


}

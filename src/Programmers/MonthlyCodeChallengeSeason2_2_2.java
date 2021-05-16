package Programmers;

public class MonthlyCodeChallengeSeason2_2_2 {

    public static void main(String[] args) {
        long [] numbers={2,7};
        System.out.println(solution(numbers));

    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i]=bitChk(numbers[i],++numbers[i]);
            System.out.println(answer[i]);
        }
        return answer;
    }

    public static long bitChk(long ori, long bit){
        double doubleBit=ori^bit;
        long test=Double.doubleToRawLongBits(doubleBit);
        String strResult=Long.toBinaryString(test);
        //bit에서 1이 2개이상있다는건

        int chk=0;
        for(int i=0;i<strResult.length();i++){
            if('1'==strResult.charAt(i)){
                chk++;
            }
            if(chk>2){
                return bitChk(ori,bit+=1);
            }
        }
        return bit;
    }
}

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

    public static Long check(long number){
        StringBuilder binaryString=new StringBuilder(Long.toBinaryString(number)); //test = 10->1010->1011 -> 11 //test = 9-> 1001 -> 1010 -> 10

        if(number%2==0){//짝수 제일 낮은 0을 1로 바꾸면 끝
            int indexZero=binaryString.lastIndexOf("0");
            binaryString.setCharAt(indexZero,'1');
            //System.out.println(binaryString);
        }else{//홀수
            /* 제일 낮은 0을 1로 바꾸고
               그 보다 낮으면서 제일 높은 자리의 1을 0으로 바꿔야함.*/
            int indexZero=binaryString.lastIndexOf("0");
            int indexOne=binaryString.lastIndexOf("1",indexZero+1);
            binaryString.setCharAt(indexZero,'1');
            binaryString.setCharAt(indexOne,'0');
            //System.out.println(binaryString);
        }
        return Long.parseLong(binaryString.toString(),2);
    }

}

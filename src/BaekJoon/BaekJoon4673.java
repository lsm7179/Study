package BaekJoon;

public class BaekJoon4673 {
    static  boolean [] isSelfNumbers =new boolean[10000];
    public static void main(String[] args) throws Exception{
        StringBuffer sb=new StringBuffer();
        for (int i=1;i< isSelfNumbers.length;i++) {
            isSelfNumbers[i]=true;
        }
        for (int i=1;i< isSelfNumbers.length;i++) {
            selfNumberCheck(i);
        }

        for (int i=1;i< isSelfNumbers.length;i++) {
            if(isSelfNumbers[i]){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void selfNumberCheck(int number){

        int nextNumber=number;
        while(number > 0) {
            nextNumber += number%10;
            number /= 10;
        }
        if(nextNumber>=10000){
            return;
        }
        if(isSelfNumbers[nextNumber]){
            isSelfNumbers[nextNumber]=false;
        }

    }


}
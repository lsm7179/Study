package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/81301
public class Solution_81301 {


    public static void main(String[] args) throws Exception{

        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        String engNumbers[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<engNumbers.length;i++){
            s=s.replaceAll(engNumbers[i],Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    public int solutionLegacy(String s) {
        s=s.replaceAll("zero","0");
        s=s.replaceAll("one","1");
        s=s.replaceAll("two","2");
        s=s.replaceAll("three","3");
        s=s.replaceAll("four","4");
        s=s.replaceAll("five","5");
        s=s.replaceAll("six","6");
        s=s.replaceAll("seven","7");
        s=s.replaceAll("eight","8");
        s=s.replaceAll("nine","9");
        return Integer.parseInt(s);
    }

}
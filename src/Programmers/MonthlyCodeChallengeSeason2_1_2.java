package Programmers;

class MonthlyCodeChallengeSeason2_1_2 {

    public static void main(String[] args) {
        String test="[](){}";
        System.out.println(solution(test));
        //System.out.println(test);
    }
    public static int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            String first=s.substring(0,1);
            String last=s.substring(1);
            s=last+first;
            String chk=new String(s);
            int result=1;

            while (chk.contains("()")||chk.contains("[]")||chk.contains("{}")){
                chk = chk.replace("()", "");
                chk = chk.replace("[]", "");
                chk = chk.replace("{}", "");
            }
            if(chk.length()>0) result=0;
            answer+=result;
        }
        return answer;
    }




}
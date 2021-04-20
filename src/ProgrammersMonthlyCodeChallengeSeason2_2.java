
class ProgrammersMonthlyCodeChallengeSeason2_2 {

    public static void main(String[] args) {
        String test="[](){}";
        System.out.println(solution(test));
        System.out.println(test);
    }
    public static int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            String first=s.substring(0,1);
            String last=s.substring(1);
            s=last+first;
            int result=1;

            while (s.contains("()")||s.contains("[]]")||s.contains("{}")){
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            }
            if(s.length()>0) result=0;
            answer+=result;
        }
        return answer;
    }

    public static int returnStack(String isVps){
        int result=0;

        while (isVps.contains("()")||isVps.contains("[]]")||isVps.contains("{}")){
            isVps = isVps.replace("()", "");
            isVps = isVps.replace("[]", "");
            isVps = isVps.replace("{}", "");
        }
        if(isVps.length()>0) result=1;
        return result;
    }


}
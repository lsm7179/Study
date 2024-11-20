package Programmers;

public class Solution_12904 {

    //https://school.programmers.co.kr/learn/courses/30/leassons/12904
    // TODO 전혀 모르겠음.
    public static void main(String[] args) {
        System.out.println(solution("abcdcba")); // 7
        System.out.println(solution("abacde")); // 3
    }

    public static int solution(String s)
    {
        char[] chr = s.toCharArray();

        // 가장 긴 문자열부터 팰린드롬 검사
        for (int leng = s.length(); leng > 1; leng--) {

            // 시작 인덱스
            for (int start = 0; start + leng <= s.length(); start++) {
                boolean chk = true;

                // 처음부터 문자열 길이의 반틈만큼 문자가 같은지 비교
                for (int i = 0; i < leng/2; i++) {
                    if (chr[start + i] != chr[start + leng  - i - 1]) {
                        chk = false;
                        break;
                    }
                }

                if (chk) return leng;
            }
        }

        return 1;
    }

}

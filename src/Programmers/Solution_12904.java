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

    // gpt가 알려줌
    public int solution2(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // dp[i][j]는 s의 i부터 j까지가 팰린드롬인지 여부를 저장
        int maxLength = 1; // 팰린드롬의 최소 길이는 1

        // 모든 단일 문자는 팰린드롬
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // 두 글자 팰린드롬 검사
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxLength = 2;
            }
        }

        // 세 글자 이상에 대한 팰린드롬 검사
        for (int len = 3; len <= n; len++) { // 부분 문자열 길이 len
            for (int i = 0; i <= n - len; i++) { // 시작 인덱스 i
                int j = i + len - 1; // 끝 인덱스 j
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    maxLength = len; // 가장 긴 팰린드롬 길이 갱신
                }
            }
        }

        return maxLength;
    }

}

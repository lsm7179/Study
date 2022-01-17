package Programmers;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
//전화번호 목록
public class Solution_42577 {

    public static boolean solution(String[] phone_book) {
        /*
        *
        * phone_book	return
        ["119", "97674223", "1195524421"]	false
        ["123","456","789"]	true
        ["12","123","1235","567","88"]	false
        *
        * */
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }
}

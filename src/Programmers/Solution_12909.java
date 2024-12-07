package Programmers;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class Solution_12909 {

    public static boolean solution(String s) {
        // 이거 queue 이용하면 됨.
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (stack.isEmpty()) {
                stack.push(charArray[i]);
            } else {
                Character pop = stack.pop();
                if (pop != '(' || charArray[i] != ')') {
                    stack.push(pop);
                    stack.push(charArray[i]);
                }
            }

        }

        return stack.isEmpty();
    }
}

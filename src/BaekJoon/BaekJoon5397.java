package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon5397 {
    static StringBuffer sb=new StringBuffer();
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCase=Integer.parseInt(br.readLine());
        for(int i=0;i<testCase;i++){
            char [] charArray= br.readLine().toCharArray();
            result(charArray);
        }
        System.out.println(sb.toString());
    }

    public static void result(char [] charArray){
        Stack<Character> leftStack=new Stack<Character>();
        Stack<Character> rightStack=new Stack<Character>();
        for(int i=0;i<charArray.length;i++){
            switch (charArray[i]){
                case '<': //왼쪽으로 가니깐 왼쪽이 있으면 작업
                    if(!leftStack.empty()){
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case '>': //오른쪽으로 가니깐 오른이 있으면 작업
                    if(!rightStack.empty()){
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case '-':
                    if(!leftStack.empty()) {
                        leftStack.pop();
                    }
                    break;
                default:
                    leftStack.push(charArray[i]);
            }
        }
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        sb.append("\n");
    }

}

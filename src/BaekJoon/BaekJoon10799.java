package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10799 {
    static int visited[];
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []pipe=br.readLine().split("");
        int result=0;
        Stack<String> stack=new Stack<>();
        for (int i=0;i<pipe.length;i++) {
            if(pipe[i].equals("(")){
                stack.push(pipe[i]);
            }else{//닫는 괄호이면 이 괄호가 레이저 인지 파이프 끝인지 알아본다.
                stack.pop();
                if(pipe[i-1].equals("(")){
                    result+=stack.size();
                }else{
                    result++;
                }

            }
        }
        System.out.print(result);
    }

}
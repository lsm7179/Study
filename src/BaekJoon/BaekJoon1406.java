package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1406 {
    static Stack<String> left = new Stack();
    static Stack<String> right = new Stack();
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //L D B P $
        String init[]=br.readLine().split("");
        for (String s : init) {
            left.push(s);
        }
        int commandLine=Integer.parseInt(br.readLine());
        for (int i = 0; i < commandLine; i++) {
            String [] command=br.readLine().split(" ");
            excute(command);

        }
        print();
    }

    static void excute(String[] command){
        switch (command[0]){
            case "L" :
                if(!left.isEmpty()){
                    right.push(left.pop());
                }
                break;
            case "D" :

                if(!right.isEmpty()){
                    left.push(right.pop());
                }
                break;
            case "B" :
                if(!left.isEmpty()){
                    left.pop();
                }
                break;
            case "P" :
                left.push(command[1]);
                break;
        }
    }
    static void print(){
        StringBuffer sb=new StringBuffer();
        while (!left.isEmpty()){
            right.push(left.pop());
        }
        while (!right.isEmpty()){
            sb.append(right.pop());
        }
        System.out.println(sb.toString());
    }

}
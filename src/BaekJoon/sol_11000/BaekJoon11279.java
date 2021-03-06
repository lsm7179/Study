package BaekJoon.sol_11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon11279 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<N;i++){
            int input=Integer.parseInt(br.readLine());
            if(input==0){
                if(priorityQueue.isEmpty()){
                    sb.append(0+"\n");
                }else{
                    sb.append(priorityQueue.poll()+"\n");

                }
            }else{
                priorityQueue.add(input);
            }
        }
        System.out.print(sb.toString());

    }



}
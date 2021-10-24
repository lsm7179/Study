package BaekJoon.sol_11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BaekJoon11286 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1)-Math.abs(o2)==0){
                    return o1-o2;
                }else{//절댓값이 가장 작은 값을 출력 절댓값이 같다면 -부터 출력
                    return Math.abs(o1)-Math.abs(o2);
                }

            }
        });
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
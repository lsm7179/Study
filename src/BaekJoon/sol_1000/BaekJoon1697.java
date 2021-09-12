package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon1697 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] input=br.readLine().split(" ");
        //5 17 4
        int n=Integer.parseInt(input[0]);
        int k=Integer.parseInt(input[1]);
        LinkedList<Integer> queue=new LinkedList<Integer>();
        int visitedTime[]=new int[100001];
        queue.add(n);
        while (!queue.isEmpty()){
            int chk=queue.peek();
            queue.poll();//제일 먼저 들어온 요소를 반환 한다.
            if(chk==k){
                System.out.print(visitedTime[chk]);
                System.exit(0);
            }
            if(chk-1>=0&&visitedTime[chk-1]==0){
                visitedTime[chk-1]=visitedTime[chk]+1;
                queue.add(chk-1);
            }
            if(chk+1<visitedTime.length&&visitedTime[chk+1]==0){
                visitedTime[chk+1]=visitedTime[chk]+1;
                queue.add(chk+1);
            }
            if(chk*2<visitedTime.length&&visitedTime[chk*2]==0){
                visitedTime[chk*2]=visitedTime[chk]+1;
                queue.add(chk*2);
            }
        }

    }

}


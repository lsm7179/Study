package BaekJoon;

import java.io.*;
import java.util.*;

public class BaekJoon1966 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){

            String testCase=br.readLine();
            String priority=br.readLine();
            System.out.println(printQueue(testCase,priority));
        }
    }

    public static int printQueue(String testCase,String priority){
        Queue<int []> queue=new LinkedList<int []>();
        StringTokenizer strToken=new StringTokenizer(testCase," ");
        StringTokenizer priorityTok=new StringTokenizer(priority," ");

        int queSize=Integer.parseInt(strToken.nextToken());
        int findNumber= Integer.parseInt(strToken.nextToken());//findNumber 를 사용해서 찾는다. 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다.
        int result=1;
        for(int i=0;i<queSize;i++){
            int priorInt=Integer.parseInt(priorityTok.nextToken());
            queue.add(new int[]{i, priorInt});//{번호 ,중요도}
        }

        while(true){
            int [] selectNum=queue.poll();
            int chk=0;
            for (int[] queArr: queue) {
                if(selectNum[1]>=queArr[1]){ //중요도 비교 맥스값체크
                    chk++;
                }
            }
            if(queue.size()<=chk){
                if(selectNum[0]==findNumber) return result; //findNumber이랑 찾아서 확인
                result++;
            }else{
                queue.offer(selectNum);
            }
        }
    }
}
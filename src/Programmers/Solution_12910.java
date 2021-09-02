package Programmers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://programmers.co.kr/learn/courses/30/lessons/12910
public class Solution_12910 {
    public int[] solution(int[] arr, int divisor) {
        int []answer={};
        List<Integer> list=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.size()>0){
            answer =new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i]=list.get(i);
            }
        }else{
            answer = new int[1];
            answer[0]=-1;
        }
        return answer;
    }
}

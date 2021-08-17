package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon5014 {
    static int visited[];
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int []input= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //F S G U D
        visited=new int [input[0]+1];
        System.out.println(bfs(input));
    }

    static String bfs(int []input){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(input[1]);
        visited[input[1]] = 1;
        while(!queue.isEmpty()){
            int chk=queue.poll();
            if(chk==input[2]){
                return String.valueOf(visited[chk]-1);
            }

            if(chk+input[3]<=input[0]&&visited[chk+input[3]]==0){//press U
                visited[chk + input[3]] = visited[chk] + 1;
                queue.add(chk + input[3]);
            }

            if(chk-input[4]>0&&visited[chk-input[4]]==0) {//press D
                visited[chk - input[4]] = visited[chk] + 1;
                queue.add(chk - input[4]);
            }
        }
        return "use the stairs";
    }

}
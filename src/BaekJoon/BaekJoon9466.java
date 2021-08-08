package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//I got help from that link. : https://bcp0109.tistory.com/32
public class BaekJoon9466 {
    static boolean visited[];
    static boolean finished[];
    static int student[];
    static int count;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        for(int t=0;t<tc;t++){
            int n=Integer.parseInt(br.readLine());
            String [] strArray=br.readLine().split(" ");
            student = new int[n+1];
            visited = new boolean[n+1];
            finished = new boolean[n+1];
            count = 0;
            for(int i=1;i<(n+1);i++){
                student[i]=Integer.parseInt(strArray[i-1]);
            }
            for(int i=1;i<(n+1);i++){
                dfs(i);
            }
            System.out.println(n - count);
        }
    }

    static void dfs(int chk){
        if(visited[chk]){
            return;
        }
        visited[chk]=true;
        int next=student[chk];
        if(!visited[next]){
            dfs(next);
        }else{
            if(!finished[next]){
                count++;
                for(int i=next;i!=chk;i=student[i]){
                    count++;
                }
            }
        }
        finished[chk]=true;
    }

}




package BaekJoon.sol_1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon1158 {

    public static void main(String[] args) throws Exception {
        int N,k = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk=br.readLine();
        N = Integer.parseInt(nk.split(" ")[0]);
        k = Integer.parseInt(nk.split(" ")[1]);
        StringBuilder sb = new StringBuilder();

        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=N;i++){
            list.add(i);
        }
        sb.append("<");
        int index=k-1;
        while(list.size()>1){
            sb.append(list.get(index)+", ");
            list.remove(index);
            index=index+k-1;
            if(index>=list.size()){
                index=index%list.size();
            }
        }
        sb.append(list.get(0)+">");
        System.out.print(sb);
    }
}
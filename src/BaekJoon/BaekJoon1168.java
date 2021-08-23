package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BaekJoon1168 {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int []nk= Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nk[0];i++){
            list.add(i+1);
        }
        StringBuffer sb=new StringBuffer();
        sb.append("<");
        int index=nk[1]-1;
        while(list.size()>1){
            sb.append(list.get(index)+",");
            list.remove(index);
            index+=nk[1]-1;
            if(index>=list.size()){
                index%=list.size();
            }

        }
        sb.append(list.get(0)+">");
        System.out.println(sb.toString());
    }
}

package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BaekJoon1786 {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String whole=br.readLine();
        String part=br.readLine();
        List<Integer> result=search(whole,part,makeTable(part));
        System.out.println(result.size());
        result.forEach(index -> System.out.print(index+1+" "));
    }

    private static List<Integer> search(String whole, String part, int [] table){
        List<Integer> list=new LinkedList<>();
        int wSize=whole.length();
        int pSize=part.length();
        char[]wholeArr=whole.toCharArray();
        char[]partArr=part.toCharArray();

        int j=0;
        for(int i=0;i<wSize;i++){
            while(j>0&&wholeArr[i]!=partArr[j]){
                j=table[j-1];
            }

            if(wholeArr[i]==partArr[j]){
                if(j==pSize-1){
                    list.add(i-j);
                    j=table[j];
                }else{
                    j++;
                }
            }
        }

        return list;
    }

    private static int[] makeTable(String word){
        int size=word.length();
        int[] table=new int[size];
        char[] words=word.toCharArray();

        int j=0;
        for(int i=1;i<size;i++){

            while(j>0&&words[i]!=words[j]){
                j=table[j-1];
            }
            if(words[j]==words[i]){
                table[i]=++j;
            }
        }
        return table;
    }

}
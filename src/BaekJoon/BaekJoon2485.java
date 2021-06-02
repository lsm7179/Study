package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BaekJoon2485 {
    static int[] tree;
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        tree=new int[N];
        for(int i=0;i<N;i++){
            tree[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(tree);
        int gcd=0;
        for(int i=0;i<N-1;i++){
            int distance=tree[i+1]-tree[i];
            gcd = GCD(distance,gcd);
        }
        System.out.println(tree[N-1]/gcd-tree[0]/gcd-(tree.length-1));

    }

    static int GCD(int a, int b)
    {
        if(b==0)return a;
        else return GCD(b,a%b);
    }
}


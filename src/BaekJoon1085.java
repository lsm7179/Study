import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1085 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
        int x=Integer.parseInt(strTok.nextToken());
        int y=Integer.parseInt(strTok.nextToken());
        int w=Integer.parseInt(strTok.nextToken());
        int h=Integer.parseInt(strTok.nextToken());
        int minX=0;
        int minY=0;

        if(w-x<x) minX=w-x;
        else minX=x;
        if(h-y<y) minY=h-y;
        else minY=y;

        if(minX<minY) System.out.println(minX);
        else  System.out.println(minY);


    }
}

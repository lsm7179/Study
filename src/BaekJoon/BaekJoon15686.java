package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BaekJoon15686 {
    static int N;
    static int M;
    static BufferedReader br;
    static int result;
    static boolean[] chk;
    static List<Point> chickenPoint;
    static List<Point> housePoint;
    public static void main(String[] args) throws Exception{
        br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strTok=new StringTokenizer(br.readLine(), " ");
        N=Integer.parseInt(strTok.nextToken());
        M=Integer.parseInt(strTok.nextToken());
        chickenPoint=new ArrayList<Point>();
        housePoint=new ArrayList<Point>();
        initCity();
        result=Integer.MAX_VALUE;
        chk=new boolean[chickenPoint.size()];
        dfs(0,0);
        System.out.println(result);
    }

    static void minChicken(List<Point> select){//치킨거리를 어케하지?
        int cityDis=0;
        for(Point hp:housePoint){
            int hr=hp.x; 
            int hc=hp.y;
            int chikenDis=Integer.MAX_VALUE;
            for (Point point:select) {
                int cr=point.x;
                int cc=point.y;
                int chk=Math.abs(hr-cr)+Math.abs(hc-cc);
                chikenDis=Math.min(chk,chikenDis);
            }
            cityDis+=chikenDis;
        }
       result=Math.min(result,cityDis);

    }

    static void dfs(int depth,int start){
        if(depth==M){
            List<Point> select=new ArrayList<Point>();
            for(int i=0;i<chickenPoint.size();i++){
                if(chk[i]) select.add(chickenPoint.get(i));
            }
            minChicken(select);
            return;
        }
        for(int i=start;i<chickenPoint.size();i++){
            chk[i]=true;
            dfs(depth+1,i+1);
            chk[i]=false;
        }
    }

    static void initCity() throws Exception{
        for(int i=1;i<=N;i++){
            StringTokenizer strTok=new StringTokenizer(br.readLine()," ");
            for(int j=1;j<=N;j++){
                int point=Integer.parseInt(strTok.nextToken());
                if(point==2){
                    chickenPoint.add(new Point(i,j)); 
                }else if(point ==1){
                    housePoint.add(new Point(i,j));
                }
            }
        }
    }

   static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());//작은 수중에 큰수 우선순위로 나옴
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();//큰수 중에 작은수 우선순위로 나옴
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<N;i++){
            int input=Integer.parseInt(br.readLine());
            if(maxHeap.size()==minHeap.size()){
                maxHeap.add(input);
                if(!minHeap.isEmpty()&&maxHeap.peek()>minHeap.peek()){
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(minHeap.poll());
                }
            }else{
                minHeap.add(input);
                if(maxHeap.peek()>minHeap.peek()){
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(minHeap.poll());
                }
            }
            sb.append(maxHeap.peek()+"\n");
        }
        System.out.print(sb.toString());

    }

}
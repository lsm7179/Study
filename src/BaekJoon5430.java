import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BaekJoon5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String trans=br.readLine();
            int dequeSize = Integer.parseInt(br.readLine());
            String input=br.readLine();
            Deque<Integer> deque=createDeque(dequeSize,input);
            System.out.println(print(deque,trans));
        }
    }

    public static Deque<Integer> createDeque(int size,String input){
        Deque<Integer> deque=new ArrayDeque<Integer>();
        StringTokenizer st = new StringTokenizer(input.substring(1, input.length() - 1), ",");

        for(int i=0;i<size;i++){
            deque.add(Integer.parseInt(st.nextToken()));
        }
        return deque;

    }

    public static String print(Deque<Integer> deque, String trans) {
        boolean isAscending=true;
        for (char ch:trans.toCharArray()) {
            switch (ch){
                case 'R':
                    isAscending=!isAscending;
                    break;
                case 'D':
                    if(!deque.isEmpty()) {
                        if (isAscending) deque.removeFirst();
                        else deque.removeLast();
                    }else return "error";
                    break;
            }
        }
        Iterator<Integer> it = isAscending?deque.iterator():deque.descendingIterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Integer e = it.next();
            sb.append(e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',');
        }
    }
}

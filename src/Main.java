import java.io.*;
import java.util.*;
/**
 * 여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 즉 먼저 요청된 것을 먼저 인쇄한다.
 * 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 FIFO - First In First Out - 에 따라 인쇄가 되게 된다.
 * 하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.
 * 현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
 * 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
 * 예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.
 *
 * 여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다. 예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.
 *
 * 첫 줄에 테스트케이스의 수가 주어진다. 각 테스트케이스는 두 줄로 이루어져 있다.
 *
 * 테스트케이스의 첫 번째 줄에는 문서의 개수 N(1 ≤ N ≤ 100)과, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M(0 ≤ M < N)이 주어진다.
 * 이때 맨 왼쪽은 0번째라고 하자. 두 번째 줄에는 N개 문서의 중요도가 차례대로 주어진다.
 * 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.
 *
 * 3
 * 1 0
 * 5
 * 4 2
 * 1 2 3 4
 * 6 0
 * 1 1 9 1 1 1
 *
 * 1
 * 2
 * 5
 * */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){

            String testCase=br.readLine();
            String priority=br.readLine();
            System.out.print(printQueue(testCase,priority));
            //printQueue(testCase,priority);
        }
    }

    public static int printQueue(String testCase,String priority){
        Queue<int []> queue=new LinkedList<int []>();
        StringTokenizer strToken=new StringTokenizer(testCase," ");
        StringTokenizer priorityTok=new StringTokenizer(priority," ");

        int queSize=Integer.parseInt(strToken.nextToken());
        int findNumber= Integer.parseInt(strToken.nextToken());
        int result=1;
        for(int i=0;i<queSize;i++){
            int priorInt=Integer.parseInt(priorityTok.nextToken());
            queue.add(new int[]{i, priorInt});//{번호 ,중요도}
        }
        //맥스값이면 뺀다. result를 ++ 한다. ok
        //findNumber 를 사용해서 찾는다. 어떤 한 문서가 몇 번째로 인쇄되는지 알아내는 것이다.
        while(true){
            int [] selectNum=queue.poll();
            int chk=0;
            for (int[] queArr: queue) {
                if(selectNum[1]>=queArr[1]){ //중요도 비교 맥스값체크
                    chk++;
                }
            }
            if(queue.size()==chk){
                if(selectNum[0]==findNumber) return result; //findNumber이랑 찾아서 확인
                queue.offer(selectNum);
                result++;
            }

        }
    }
}


















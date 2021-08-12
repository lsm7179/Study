package techniqueStudy;

import java.util.LinkedList;
import java.util.List;

public class kmpAlgorithm {

    private int[] table;

    public static void main(String[] args) throws Exception{

    }

    private int[] makeTable(String part) {
        // 같은 문자열(part)을 가지고 KMP 알고리즘을 실행함

        int size = part.length();
        char[] string = part.toCharArray();
        int[] table = new int[size];

        for (int i = 1, j = 0; i < size; i++) {
            // KMP 실행. (i=1, j=0으로 한칸 차이나게 포개어놓고 시작)

            while (j > 0 && string[i] != string[j])
                // 문자열이 일치하지 않았다면  
                j = table[j - 1];

            if (string[i] == string[j])
                // 문자열이 일치했다면  
                table[i] = ++j;
            // j를 증가시키고, 증가된 j값이 LPS값이 됨.

        }

        return table;
    }
    
    public List<Integer> search(String whole, String part) {
        List<Integer> result = new LinkedList<>();
        int w = whole.length();
        int p = part.length();

        char[] wh = whole.toCharArray();
        char[] pa = part.toCharArray();

        for (int i = 0, j = 0 ; i < w ; i++) {
            // 문자열 전체 인덱스(i)로 문자열을 순회하면서

            while (j > 0 && wh[i] != pa[j]){
                // 문자열이 일치하지 않을 때,
                // while인 이유는 반드시 아래 두가지 경우 중 하나여야 루프가 진행되기 때문.
                // 즉, while은 아래 두가지 경우일 수 밖에 없게 보장함. (걸려서 아래로 못내려감)
                // case 1) j=0으로 보내서 pattern 문자열을 처음부터 비교.
                // case 2) wh[i] == pa[j]이기 때문에, prefix(j)까지 일치했으므로 그 뒤부터 비교.

                j = table[j - 1];
                // 1) 만약 j=0이 되었다면 다음 상황에선 pattern 문자열의 처음부터 비교
                // 2) 만약 j!=0이 되었다면 i도 그 만큼(j만큼) 증가해있는 상황으로 이해하고,
                // 이미 맞은 prefix들은 검사하지 않고 그 뒤부터 비교를 진행함.

                // 이 부분이 핵심임. 위 설명처럼 j가 j--처럼 진짜 뒤로 움직이는게 아니라
                // j는 일치된 prefix의 끝지점까지 바로 이동해서 이미 비교가 완료된 상태로 만듬.

                // 예시)
                // (i=10, j=6)에서 j = table[6-1] = 2로 이동하여 (i=10, j=2)로 왔다면
                // (i=8, j=0), (i=9, j=1)인 경우는 prefix로 일치했기 때문에
                // 반드시 (wh[8] == pa[0]), (wh[9] == pa[1])가 될 수밖에 없음.
                // 때문에 이 부분은 비교 없이 건너뛰고, (i=10, j=2)부터 비교를 시작하면 됨.
                // 즉, (i=10, j=2)인 상태에서 아래의 if문을 만나게 됨.

                // 코드 아래의 시뮬레이션 설명을 보고 자세히 이해바람.
            }


            if (wh[i] == pa[j]) {
                // 만약에 문자열이 일치했다면

                if (j == p - 1) {
                    // 검사한 패턴 문자열 개수가 패턴 문자열 길이와 같다면
                    // 즉, 문자열을 모두 비교했는데, 마지막 문자까지 동일했다면

                    result.add(i - j);
                    // 검사가 끝난 것이니, 배열에 담음.
                    // 현재 끝 위치이기 때문에 현재 위치 i에서 패턴의 끝 위치 j를 빼면
                    // i-j는 pattern 문자열이 전체 문차열에서 위치한 시작 인덱스가 됨.
                    // 즉, 모두 매칭된 부분의 시작위치를 리스트에 담음.

                    j = table[j];
                    // 그리고 j는 현재 위치까지 전부 맞았으니
                    // j를 일치되는 prefix의 맨 끝으로 이동시켜서 (LPS테이블)
                    // 일치하는 prefix의 뒤쪽부터 다시 비교를 시작하게 만듬.

                } else // 아직 검사중이라면
                    j++; // j를 뒤로 계속 보내서 검사를 진행
            }

        }

        return result;
        // 결과 리스트를 반환
    }


}
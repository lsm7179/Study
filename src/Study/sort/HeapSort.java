package Study.sort;

import java.util.Arrays;

//https://parkhyeokjin.github.io/algorithm/2019/08/16/heapAlgorithm.html
public class HeapSort {
    public static void main(String[] args) {
        HeapSort(new int[] {5,4,3,2,1,});
    }

    private static void HeapSort(int[] nums) {
        //힙생성 알고리즘 수행
        heapify(nums, 0, nums.length);
        //정렬 수행
        for(int i = nums.length - 1; i >= 0; i--) {
            //가장큰 수인 첫번째 숫자와 가장 마지막 숫자의 자리를 교체 한다.
            swap(nums, 0, i);
            //배열의 첫번째 부터 교체된 인덱스까지 힙생성 알고리즘을 수행한다.
            heapify(nums, 0, i);
        }
        //출력
        System.out.println(Arrays.toString(nums));
    }

    //힙 생성
    private static void heapify(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            int childIdx = i;
            while(childIdx != 0) {//0 을 제외하고 모든 인덱스는 부모노드가 있다.
                int rootIdx = (childIdx - 1) / 2;
                if(nums[rootIdx] < nums[childIdx]) {
                    swap(nums, childIdx, rootIdx);
                }
                childIdx = rootIdx;
            }
        }
    }

    //인덱스 스왑
    private static void swap(int[] nums, int child, int root) {
        int temp = nums[root];
        nums[root] = nums[child];
        nums[child] = temp;
    }
}
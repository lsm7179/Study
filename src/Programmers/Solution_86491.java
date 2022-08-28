package Programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Solution_86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);
    }

    public static int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;

        for (int[] size : sizes) {
            if(size[0] > size[1]){
                wMax = Integer.max(wMax, size[0]);
                hMax = Integer.max(hMax, size[1]);
            } else{
                wMax = Integer.max(wMax, size[1]);
                hMax = Integer.max(hMax, size[0]);
            }
        }

        return wMax*hMax;
    }
}

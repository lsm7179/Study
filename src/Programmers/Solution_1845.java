package Programmers;
import java.util.*;

class Solution_1845 {
    public int solution(int[] nums) {
        Set<Integer> animals = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            animals.add(nums[i]);
        }
        if(animals.size() >= nums.length/2){
            return nums.length/2;
        }else{
            return animals.size();
        }

    }
}
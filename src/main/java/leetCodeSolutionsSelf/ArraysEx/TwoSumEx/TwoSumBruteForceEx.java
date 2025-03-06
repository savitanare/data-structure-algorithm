package main.java.leetCodeSolutionsSelf.ArraysEx.TwoSumEx;

import java.util.Arrays;

public class TwoSumBruteForceEx {

    public int[] twoSum(int[] nums, int target) {

        int i , j;
        int sum = 0;

        //brute force solution where TC : O(N^2) and SC : O(1)
        for(i = 0; i< nums.length; i ++){
            for(j = i + 1 ; j< nums.length; j++){
                sum = nums[i] + nums[j]; 
                if (sum == target) {
                    return new int[]{i, j}; 
                }
            }
        }

    
        return new int[]{};
        
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

        TwoSumBruteForceEx t = new TwoSumBruteForceEx();
        System.out.println(
        Arrays.toString(t.twoSum(nums, target)));

        
    }
    
}

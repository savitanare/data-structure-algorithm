package main.java.leetCodeSolutionsSelf.TwoSumEx;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimizedEx {

    public int[] twoSum(int[] nums, int target) {

        //Optimized Solution TC : O(N) and SC : O(N)

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < nums.length; i ++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
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

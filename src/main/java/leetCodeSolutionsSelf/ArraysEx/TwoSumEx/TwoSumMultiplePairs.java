package main.java.leetCodeSolutionsSelf.ArraysEx.TwoSumEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSumMultiplePairs {
    public static List<int[]> twoSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                for (int index : map.get(complement)) {
                    result.add(new int[]{index, i});
                }
            }
            
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 3, 5, 2, 3};
        int target = 6;
        List<int[]> pairs = twoSum(nums, target);
        
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
    
}

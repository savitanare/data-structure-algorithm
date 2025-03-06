package main.java.leetCodeSolutionsSelf.ArraysEx.RemoveDuplicatesSortedArray;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateEX1 {

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> uniqueList = new ArrayList<>(); // Stores unique elements

        // Traverse the array and store only unique elements
        for (int num : nums) {
            if (!uniqueList.contains(num)) { // Check if it's a duplicate
                uniqueList.add(num);
            }
        }

        // Copy back unique elements to nums
        for (int i = 0; i < uniqueList.size(); i++) {
            nums[i] = uniqueList.get(i);
        }

        return uniqueList.size(); // Return the count of unique
        
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        RemoveDuplicateEX1 solution = new RemoveDuplicateEX1();
        int k = solution.removeDuplicates(nums);
        
        System.out.println("New length: " + k);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
    
}

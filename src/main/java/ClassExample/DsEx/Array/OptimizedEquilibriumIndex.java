package main.java.ClassExample.DsEx.Array;

public class OptimizedEquilibriumIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        //brute force TC: O(N)  SC: O(1)
        // Compute total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate to check pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum = totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found pivot index
            }
            leftSum += nums[i]; // Update left sum
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        OptimizedEquilibriumIndex sol = new OptimizedEquilibriumIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(sol.pivotIndex(nums)); // Output: 3
    }
    
}

package main.java.ClassExample.DsEx.Array;

import java.util.HashSet;

public class SubarrayOptimizedEx {

    public boolean hasSubarrayWithZeroSum(int[] nums) {
        HashSet<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            sum += num;

            if (sum == 0 || prefixSums.contains(sum)) {
                return true;
            }

            prefixSums.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        SubarrayOptimizedEx sol = new SubarrayOptimizedEx();
        int[] nums = {4, 2, -3, 1, 6};
        System.out.println(sol.hasSubarrayWithZeroSum(nums)); 

        int[] nums2 = {1, 2, 3};
        System.out.println(sol.hasSubarrayWithZeroSum(nums2));
    }
    
}

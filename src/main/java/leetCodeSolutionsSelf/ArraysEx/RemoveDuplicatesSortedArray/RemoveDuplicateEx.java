package main.java.leetCodeSolutionsSelf.RemoveDuplicatesSortedArray;

import java.util.Arrays;

public class RemoveDuplicateEx {
    public int removeDuplicates(int[] nums) {

    // Optimized Solution   using TWO POINTER                   TC : O(N) and SC : O(1)
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
        


    public static void main(String[] args) {
        int nums[] = {1,1,2};
        RemoveDuplicateEx r = new RemoveDuplicateEx();
        int k = r.removeDuplicates(nums);


        System.out.println(k);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, k)));


    }
    
}

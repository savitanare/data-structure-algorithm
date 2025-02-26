package main.java.leetCodeSolutionsSelf.RemoveElements;

import java.util.Arrays;

public class RemoveElementsEx1 {

    public int removeElement(int[] nums, int val) {

        // Optimized solution        TC: O(N) and SC: O(1)

        int j = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;

        RemoveElementsEx r = new RemoveElementsEx();
        int k = r.removeElement(nums, val);

        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
    
}

package main.java.ClassExample.DsEx.Array;

public class EquilibriumIndex {

    //brute force TC : O(N^2)  SC: O(1) 
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int leftSum = 0, rightSum = 0;

             // Calculate left sum
             for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        
        return -1; 
        
    }

  public static void main(String[] args) {
    int nums[] = {1,7,3,6,5,6};
    EquilibriumIndex e = new EquilibriumIndex();
    System.out.println(e.pivotIndex(nums));
  }
    
}

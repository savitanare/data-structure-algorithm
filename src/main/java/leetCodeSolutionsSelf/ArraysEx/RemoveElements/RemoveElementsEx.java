package main.java.leetCodeSolutionsSelf.ArraysEx.RemoveElements;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsEx {

    public int removeElement(int[] nums, int val) {

        // Brute force solution        TC: O(N) and SC: O(N)
        ArrayList<Integer> tempList = new ArrayList<>();

        for(int num : nums){
            if(num != val){
                tempList.add(num);
            }
        }

        for(int i = 0; i <tempList.size(); i++){
            nums[i] = tempList.get(i);
        }


        return tempList.size();
        
    }

    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;

        RemoveElementsEx r = new RemoveElementsEx();
        int k = r.removeElement(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
    
}

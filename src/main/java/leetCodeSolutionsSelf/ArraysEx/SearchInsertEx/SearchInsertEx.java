public class SearchInsertEx {

    public int searchInsert(int[] nums, int target) {

        // brute force solution TC: O(N) and SC: O(1)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
        
    }

    public static void main(String[] args) {

        int num[] ={1,3,6};
        int target = 5 ;

        SearchInsertEx s = new SearchInsertEx();
        System.out.println(s.searchInsert(num, target));


        
    }
    
}

public class SerchInsertEx1 {

    public int searchInsert(int[] nums, int target) {

        // Optimized solution TC: O(N Log N) and SC: O(1)
        int start = 0;
        int end = nums.length -1;
        
        while(start <= end){
            int mid = start + (end -start)/2;
            if(nums[mid] == target)
            return mid;

            else if (nums[mid] > target)
            end = mid - 1;

            else start = mid + 1;

        }


        return start;
        
    }

    public static void main(String[] args) {
        int num[] ={1,3,6};
        int target = 5 ;

        SerchInsertEx1 s = new SerchInsertEx1();
        System.out.println(s.searchInsert(num, target));
    }
    
}

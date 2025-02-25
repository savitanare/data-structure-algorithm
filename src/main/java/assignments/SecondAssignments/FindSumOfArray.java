package main.java.assignments.SecondAssignments;

public class FindSumOfArray {
    public int sumOfArray(int[] a){
        int n = a.length;
        int sum = 0;

        for(int i = 0; i <n; i++){
            sum += a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        FindSumOfArray f = new FindSumOfArray();
        int result = f.sumOfArray(arr);
        System.out.println(result);

    }
    
}

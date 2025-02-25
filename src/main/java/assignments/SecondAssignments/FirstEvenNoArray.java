package main.java.assignments.SecondAssignments;

public class FirstEvenNoArray {
    public int firstEvenNumberInArray(int a[]){

        int n = a.length;

        for(int i = 0; i < n; i++){
            if(a[i]% 2 ==0){
                return a[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1,7,4,8,5};
        FirstEvenNoArray f = new FirstEvenNoArray();
        int n = f.firstEvenNumberInArray(arr);
        System.out.println(n);

    }
    
}

package main.java.assignments.SecondAssignments;

public class OddElementArray {

    public static int[] getOddElements(int[] arr){


        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

      
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }

        return oddNumbers;

    }


    public static void main(String[] args) {
        int arr[] = {1,5,6,4,3,2,8};
        int[] oddElements = getOddElements(arr);
        
         System.out.print("[");
         for (int i = 0; i < oddElements.length; i++) {
             System.out.print(oddElements[i]);
             if (i < oddElements.length - 1) {
                 System.out.print(", ");
             }
         }
         System.out.println("]");

    }
    
}

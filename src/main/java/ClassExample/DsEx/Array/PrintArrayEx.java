package main.java.ClassExample.DsEx.Array;

import java.util.ArrayList;

public class PrintArrayEx {

    static void printArray(int[] arr, int n){

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        
        }
        System.out.println("-------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num);
        }

        for (int num : arrayList) {
            System.out.println(num);
        }
    }



    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        printArray(arr, n);

    }
    
}

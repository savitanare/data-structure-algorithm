package main.java.leetCodeSolutionsSelf.ArraysEx.PascalsTraingle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleEx {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0 ) return triangle;


        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        if(numRows == 1) return triangle;

        for(int i = 1 ; i <numRows; i++){
            List<Integer> prevRow = triangle.get(i - 1);

            //Start next row

            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 0 ; j < i - 1; j++){
                row.add(prevRow.get(j) + prevRow.get(j + 1));

            }

            row.add(1);

            triangle.add(row);
        }




        return triangle;
    }


    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        int numRows = 5; // Change this for different values
        List<List<Integer>> result = generate(numRows);
        printTriangle(result);
    }
}

package main.java.assignments.SecondAssignments;


public class Min3_elements {

    public int min3Value(int a , int b , int c){

        int minValue = 0;
        minValue = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return minValue;

    }

    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = 40;

        Min3_elements m = new Min3_elements();
        int result = m.min3Value(a, b, c);
        System.out.println(result);


    }
    
}

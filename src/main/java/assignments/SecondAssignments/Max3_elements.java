package main.java.assignments.SecondAssignments;

public class Max3_elements {

    public int maxValue(int a, int b , int c){

        // if(a >= b && b >=c){
        //     return a;
        // }else if(b >= c && b >= a){
        //     return b;
        // }else{
        //     return c;
        // }

        //with ternary operator 

        int largest = 0;
        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

        
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 20;

        Max3_elements m = new Max3_elements();
        m.maxValue(a, b, c);
         System.out.println(m.maxValue(a, b, c));

    }
    
}

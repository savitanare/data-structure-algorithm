package main.java.assignments.SecondAssignments;

public class MidOf3 {

    public int midOf3(int a , int b, int c){
        if((a < b && b < c) || (c < b && b < a))
        return b;
        else if ((b < a && a <c ) || (c < a && a < b))
        return a;
        else return c;
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 20;

        MidOf3 m = new MidOf3();
        System.out.println(m.midOf3(a, b, c));
        
    }
    


    
}

package main.java.assignments.FirstAssignments;

public class Mini3No {

    public int minOfThree(int a , int b , int c){

        if(a <b && b < c)
        return a;
        else if (b < c && c < a)
        return b;

        return c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 8;

        Mini3No m = new Mini3No();
        System.out.println(m.minOfThree(a, b, c));

    }
    
}

package main.java.assignments.FirstAssignments;

public class EvenOrOdd {

    public void evenOdd(int n){

        if(n % 2 == 0){
            System.out.println("Number is even number : " + n);
        }else{
            System.out.println("Number is Odd number : " + n);
        }

    }
    public static void main(String[] args) {
        int n = 55;

        EvenOrOdd e = new EvenOrOdd();
        e.evenOdd(n);
        
    }
    
}

package main.java.assignments.SecondAssignments;

public class PrintSeriesEx1 {

    void print5Series(int n){

        for(int i = 0; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j + " ");
            }
           System.out.println( );
        }

    }
    public static void main(String[] args) {
        int n = 5;
        PrintSeriesEx1 p = new PrintSeriesEx1();
        p.print5Series(n);
    }
    
}

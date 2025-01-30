package main.java.assignments.SecondAssignments;

public class PrintSeriesEx2 {

    void printSeries(int n){

        for(int i = 5; i>=0; i--){
            for(int j = 1; j <=i; j++){
                System.out.print(j + " ");
            }
           System.out.println( );
        }

    }

    public static void main(String[] args) {
        int n = 5;
        PrintSeriesEx2 p = new PrintSeriesEx2();
        p.printSeries(n);

    }
    
}

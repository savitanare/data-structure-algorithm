package main.java.assignments.FirstAssignments;

public class TaxCalculation {

    public double taxCalculation(int amount){
        double taxBaseAmount = 50000;


        double taxRate = (amount > taxBaseAmount) ? 0.10 : 0.05;
        double taxAmount = amount * taxRate;
        return taxAmount;
    }

    public static void main(String[] args) {
        int amount = 40000;

        TaxCalculation t = new TaxCalculation();
        System.out.println(t.taxCalculation(amount));

    }
    
}

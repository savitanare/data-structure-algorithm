package main.java.assignments.FirstAssignments;

public class LeapYear {

    public void checkLeapYear(int year){

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println("Year is leap year: " +year);
        }else{
            System.out.println("Year is not leap year: " +year);
        }
    }

    public static void main(String[] args) {
        int year = 1900;
        LeapYear l = new LeapYear();
        l.checkLeapYear(year);

    }
    
}

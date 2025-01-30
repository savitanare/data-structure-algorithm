package main.java.assignments.FirstAssignments;

public class MarriageEligible {

    public String eligibleMrriageAge(int girlAge, int boyAge){

        if(girlAge >= 18 && boyAge >= 21){
            return "YES";
        }else{
        return "NO";
        }
    }

    public static void main(String[] args) {
        int girlAge = 11;
        int boyAge = 29;

        MarriageEligible m = new MarriageEligible();
        System.out.println(m.eligibleMrriageAge(girlAge, boyAge));


    }
    
}

public class CheckStringEx {

    public static void main(String[] args) {
        String a = "devang";
        String b = "dev";

        boolean isSubstring = a.indexOf(b) != -1;
        System.out.println(isSubstring);

        System.out.println(a.contains(b));


    }
    
}

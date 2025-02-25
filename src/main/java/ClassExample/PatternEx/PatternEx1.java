public class PatternEx1 {

    public void pattern (int N){
        int count = 1;

        for(int i = 1; i<=N; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(count + " ");
                count++;
            }
           System.out.println( );
        }

    }

    public static void main(String[] args) {

        int n = 5;

        PatternEx1 p = new PatternEx1();
        p.pattern(n);        
    }
}

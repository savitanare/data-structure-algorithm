package main.java.classEx;

public class MaxOf3 {

    int maxOfThree(int a, int b , int c){
        int largest ;

        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;
    }

    public static void main(String[] args) {
        int a , b, c;
        a = 10; b = 20; c = 5;

        int l , m , n;
        l = 10; m = 20; n = 30;

        int i , j , k;
        i = 20; j = 20; k = 20;

        int x , y, z;
        x = 20; y = 20; z = 10;

        int e , f, g;
        e = -10; f = -10; g = -15;
    

        MaxOf3 max = new MaxOf3();
        System.out.println("First value : " +max.maxOfThree(a, b, c));
        System.out.println("Third value : " +max.maxOfThree(l, m, n));
        System.out.println("Second value : " +max.maxOfThree(i, j, k));
        System.out.println("Fourth value : " +max.maxOfThree(x, y, z));
        System.out.println("Fifth value : " +max.maxOfThree(e, f, g));
    }
    
}

import java.util.Scanner;

/**
 * project euler
 *   Sum of MultOfThreeFive
 */
public class ScannerMultOfThreeFive2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        // the following is a faster way to solve this problem.
        for(long i=0;i<t;i++){

            long n = sc.nextLong();
            long a=0, b=0, d=0;

            a=(n-1)%3;
            a=n-1-a;
            a=a/3;
            b=(n-1)%5;
            b=n-1-b;
            b=b/5;
            d=(n-1)%15;
            d=n-1-d;
            d=d/15;

            long c= 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*d*(d+1)/2;
            System.out.println(c);
        }
    }
}
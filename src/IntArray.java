import java.util.*;

public class IntArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int val = 10 ;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            val = 10;
            a[i] = val;
            val = val + 10;

        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
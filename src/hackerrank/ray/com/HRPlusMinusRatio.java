package hackerrank.ray.com;

import java.util.Scanner;

public class HRPlusMinusRatio {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        float zero = 0;
        float positive = 0;
        float negative = 0;

        for ( int v : arr) {

            if ( v == 0) {
                zero++;
            }
            else if ( v > 0) {
                positive++;
            }
            else if ( v < 0) {
                negative++;
            }


        }

        System.out.printf("%1.6f \n", positive / arr.length);
        System.out.printf("%1.6f \n", negative / arr.length);
        System.out.printf("%1.6f \n", zero / arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = { 2, 3, -1, 0, 1, -4 };
        plusMinus(arr);

    }
}

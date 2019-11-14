package hackerrank.ray.com;

import java.util.Arrays;

/**
 * sorts array and returns number of the max value in the array
 */
public class BirthdayCandles {

    static int birthdayCakeCandles(int[] ar) {

        int length = ar.length;
        int count = 0;
        Arrays.sort(ar);
        int max = ar[length - 1];

        for (int i = 0; i < length; i++){

            if (max == ar[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] x = {3,3, 2, 9,9,0};
        birthdayCakeCandles(x);
    }

}

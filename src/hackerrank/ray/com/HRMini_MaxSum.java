package hackerrank.ray.com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;
/**
 * Given five positive integers, find the minimum and maximum values that can be
 * calculated by summing exactly four of the five integers. Then print the respective
 * minimum and maximum values as a single line of two space-separated long integers.
 *
 * For example, . Our minimum sum is  and our maximum sum is . We would print
 */
public class HRMini_MaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long min = arr[0];
        long max = arr[5];
        long sum = arr[0] + arr[1] + arr[2] + arr[3];
              //long max = arr[arr.length-4] + arr[arr.length-3] + arr[arr.length-2] + arr[arr.length-1];


        System.out.println((long) min + " " + (long)max);

    }


    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};

        miniMaxSum(arr);

    }
}

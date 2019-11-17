package hackerrank.ray.com;

import java.util.Arrays;

public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    public static int minimumSwaps(int[] arr) {

        int swaps = 0;

        for ( int i = 0; i < arr.length; i++){

            Arrays.asList(arr).indexOf(i);
            if (arr[i] != i){
                swaps++;
            }
        }


        return swaps / 2;
    }


    public static void main(String[] args){

       int[] arr = {4, 3, 1, 2};

       System.out.print(minimumSwaps(arr));

    }
}

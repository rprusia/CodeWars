package hackerrank.ray.com;

import java.util.Scanner;

public class BubbleSortDay20 {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        //int[] a = new int[n];
        int[] a = {3, 2, 1};
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        // Write Your Code Here

        int arrLen = a.length;
        int temp = 0;
        int swaps = 0;

        for (int i = 0; i < arrLen - 1; i++) {

            for (int j = 0; j < arrLen - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    // swap arr[j+1] and arr[i]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;

                }

            }

        }
        System.out.println("Array is sorted in " +  swaps +  " swaps.");
        System.out.println("First Element: " +  a[0]);
        System.out.println("Last Element: " +  a[arrLen - 1]);
    }
}


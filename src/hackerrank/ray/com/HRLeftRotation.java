package hackerrank.ray.com;

import java.util.Arrays;

public class HRLeftRotation {

    /**
     * HackerRank - Rotate Left.
     *
     * Left rotation operation on an array shifts each of the array elements 1 unit to the left.
     * Ex. if 2 left rotations are performed on [1,2,3,4,5] then new array would be [3,4,5,1,2]
     * @param a integer array
     * @param d  number of rotations
     * @return
     */
    static int[] rotLeft(int[] a, int d){

        int size = a.length;
        int[] rotated_arr = new int[size];
        int i = 0;
        int rotate_index = d;  // index where rotation starts.

        while (rotate_index < size ){
            rotated_arr[i] = a[rotate_index];
            i++;
            rotate_index++;
        }

        rotate_index = 0;  // set index back to 0 and move other digits to end of new array, notice i is not reset to zero.
        while (rotate_index < d) {
            rotated_arr[i] = a[rotate_index];  // notice i is not reset back to 0.
            i++;
            rotate_index++;
        }

        return rotated_arr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString( rotLeft(arr, 2)));
    }
}

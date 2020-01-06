package leetcode.ray.com;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] matrix) {

        // chk for empty matrix
        if (matrix.length == 0 || matrix == null){
            return new int[0];
        }

        // variables to track size of matrix
        int N = matrix.length;
        int M = matrix[0].length;

        // two arrays needs
        int[] result = new int[N * M];  // create array to hold all values in matrix which is N * M.
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();

        // We have to go over all the elements in the first
        // row and the last column to cover all possible diagonals
        for (int d = 0; d < N + M - 1; d++){

            intermediate.clear(); // clear every time we start to process another diagonal

            // need to figure out the head of this diagonal
            // elements in first row and last column
            // are the respective heads.
            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;

            // Iterate until one of the indices goes out of scope
            // Take note of the index math to go down the diagonal
            while (r < N && c > -1) {

                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }

            // Reverse even numbered diagonals. The
            // article says we have to reverse odd
            // numbered articles but here, the numbering
            // is starting from 0 :P
            if (d % 2 == 0) {
                Collections.reverse(intermediate);
            }

            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }

        }

        return result;
    }
    public static void main(String[] args) {

        int[][] arr =  {
                {1,2,3,5},
                {4,5,6,5},
                {7,8,9,5}
        };

        System.out.println(findDiagonalOrder(arr));
    }
}



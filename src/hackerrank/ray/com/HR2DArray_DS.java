package hackerrank.ray.com;

public class HR2DArray_DS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int rows = arr.length;
        int columns = arr[0].length;
        int max_hourglass_sum = Integer.MIN_VALUE;   // set max to min value

        for ( int i = 0; i < rows - 2; i++){

            for ( int j = 0; j < columns-2; j++) {

                int current_hourglass_sum  =
                        arr[i][j] + arr[i][j+1] + arr[i][j+2]  // first row of hour glass
                                + arr[i+1][j+1]                     // middle row of hour glass
                        + arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2];
                    max_hourglass_sum = Math.max( max_hourglass_sum, current_hourglass_sum );

            }

        }

        return max_hourglass_sum;

    }

    public static void main(String[] args) {

        int[][] intArray = {
                {-9, -9, -9,  1, 1, 1},
                {0, -9,  0,  4, 3, 2},
                {-9, -9, -9,  1, 2, 3},
                {0,  0,  8,  6, 6, 0},
                {0,  0,  0, -2, 0, 0},
                {0,  0,  1,  2, 4, 0}};

        hourglassSum(intArray);
    }

}

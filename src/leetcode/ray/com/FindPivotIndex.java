package leetcode.ray.com;

public class FindPivotIndex {

    public static int pivotIndex ( int[] nums) {

        int total_sum = 0;
        int left_sum = 0;

        // get total sum so you know value of the array.
        for ( int i = 0; i < nums.length; i++){
            total_sum += nums[i];
        }

        // total_sum - left_sum - nums[i] == left_sum;
        for (int i = 0; i < nums.length; i++){

            if ( i != 0) {  // only add to left_sum if not index 0;
                left_sum += nums[i-1];
            }

            if (total_sum - left_sum - nums[i] == left_sum) {  // compare right sum to left_sum
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};

        System.out.println(pivotIndex(arr));
    }

}

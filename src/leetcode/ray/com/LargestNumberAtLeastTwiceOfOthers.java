package leetcode.ray.com;
/*
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public static int dominantIndex(int[] nums) {

        int maxVal = -1;
        int secondMax = 0;
        int temp = 0;
        int index = -1;
        // find larget element
        for(int i = 0; i < nums.length; i++) {
           if (nums[i] > maxVal){
               temp = maxVal;
               maxVal = nums[i];
               secondMax = temp;
               index = i;  // location in array of max.
           } else if ( nums[i] > secondMax) {
               secondMax = nums[i];
           }
        }

        if (maxVal >= 2 * secondMax){
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] x = new int[] {0,0,0,2};
        System.out.println(dominantIndex(x));
    }
}

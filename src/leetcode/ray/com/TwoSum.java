package leetcode.ray.com;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap();  // create hashmap to hold values.

        int index = nums.length - 1;  // start at end of array length - 1;

            while(index >= 0) {

                int complement = target - nums[index];  // this is used to determine if complement value is already in hashmap, if below.

                if (complements.containsKey(complement)) {   // if hashmap contains index
                    return new int[] {complements.get(complement), index};
                }

                complements.put(nums[index], index);  // add values to hashmap
                index--;
            }

            return null;
        }

    public static void main(String[] args) {

        int[] vals = { 1,2, 3, 4, 5};
        int target = 7;

        System.out.print(Arrays.toString(twoSum(vals, target)));

    }
}

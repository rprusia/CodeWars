package hackerrank.ray.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HRDiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        return 1;
    }


        public static void main(String[] args)
        {
            int n = 3;

            // Here aList is an ArrayList of ArrayLists
            List<List<Integer>> aList = new ArrayList<List<Integer>>(3);
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            a1.add(1);
            a1.add(2);
            aList.add(a1);

            ArrayList<Integer> a2 = new ArrayList<Integer>();
            a2.add(5);
            aList.add(a2);

            ArrayList<Integer> a3 = new ArrayList<Integer>();
            a3.add(10);
            a3.add(20);
            a3.add(30);
            aList.add(a3);

            for (int i = 0; i < aList.size(); i++) {
                for (int j = 0; j < aList.get(i).size(); j++) {
                    System.out.print(aList.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }





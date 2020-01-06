package leetcode.ray.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * The ArrayList class is a resizable array, which can be found in the java.util package.
 *
 * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
 * (if you want to add or remove elements to/from an array, you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want.
 * The syntax is also slightly different:
 * ArrayList<Integer> intArr = new ArrayList<Integer>();
 */
public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<Integer>();

        for ( int i = 0; i < 10; i++){
            intArr.add(i, i);  // add by index
        }

        System.out.println(intArr.get(1));  // value by index.
        System.out.println("--------------------");
        intArr.set(5,10);   // set by index

        //Java  program to iterate over an ArrayList
        for ( int i = 0; i < intArr.size(); i++){
            System.out.println(intArr.get(i)); // add by index
        }
       System.out.println("--------Prints the index that contains value of 10.------------");
       System.out.println(intArr.indexOf(10));
       System.out.println("--------------------");

        System.out.println("--------99 does not exist so it prints -1.------------");
        System.out.println(intArr.indexOf(99));
        System.out.println("--------------------");


        System.out.println("---------- value 10 will be remove ----------");
        intArr.remove(intArr.remove(intArr.indexOf(10)));

        for ( int i = 0; i < intArr.size(); i++){
            System.out.println(intArr.get(i)); // add by index
        }

        System.out.println("--------------------");

        // Method 2: Using for each loop
        // iterate over array list - Using for each loop
        for (Integer  i : intArr){
            System.out.println("Iterate using For Each Loop:  " + i);
        }

        // Method 3 : Using Iterator

        Iterator it = intArr.iterator();   // set the arrayLis to Iterator.

        while (it.hasNext()){
            System.out.println("Iterate using iterator: " + it.next());
        }


        // Method 3 : Using For Each Method of Java 8, lambda
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.forEach(number -> System.out.println("iterate using a lambda function." + number));  // using lambda function

    }

}

package hackerrank.ray.com;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    public int divisorSum(int n) {

        int sum = n;
        for (int i = 1, half = n/2; i <= half; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;

    }
}

public class InterfaceExample_Day19 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        //scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(10);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}


package codewars.ray.com;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] y = s.split("[^A-Za-z]+");

        System.out.println(y.length);

        for ( String z : y )
            System.out.println(z);

        scan.close();
    }
}


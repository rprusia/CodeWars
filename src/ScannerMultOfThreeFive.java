import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScannerMultOfThreeFive {

    public static void main(String[] args) {
        int result = 0;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a = 0; a < t; a++){
            int n = in.nextInt();

                for ( int j =1; j < n; j++){
                    if ((j % 5 == 0) || (j % 3 == 0)) {
                        result += j;
                    }
                }

            System.out.println(result);
            result = 0;
        }
    }

}

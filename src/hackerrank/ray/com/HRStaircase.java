package hackerrank.ray.com;

import java.awt.*;

public class HRStaircase {

    static void staircase(int n) {

        StringBuilder currentLine = new StringBuilder();
        int line = 1;
        int numSpaces = 0;
        int numPoundSymbols = 0;

        do {
            numSpaces = n - line;
            numPoundSymbols = n - numSpaces ;
            for ( int i = 0; i < numSpaces; i++){
                currentLine.append(" ");
            }

            for ( int i = 0; i < numPoundSymbols; i++){
                currentLine.append("#");
            }

            line++;
            System.out.println(currentLine);
            currentLine.setLength(0);

        } while (line<= n);

    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(100);

        //scanner.close();
    }
}


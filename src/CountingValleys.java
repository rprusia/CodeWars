import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.

    static int countingValleys(int n, String s) {

       int numberOfValleys = 0;
       int currentLevel  = 0;

       for (char c : s.toCharArray()) {
            if ( c == 'U')
                ++currentLevel;
            if ( c == 'D')
                --currentLevel;

           // only worried about number of times you return up to sea level,
            if (currentLevel == 0 &&  c == 'U') {
                ++numberOfValleys;
            }

       }

        return numberOfValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
        int n = 1;
        String s = "UDDDUDUU";
        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}


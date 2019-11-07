import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SockPairs {
        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {

           Set<Integer> colors = new HashSet<>();
           int pairs = 0;

           for (int i = 0; i < ar.length; i++) {

               if (!colors.contains(ar[i])){  // this line attempts to add elemnt to set, if duplicate else is executed
                   colors.add(ar[i]);
               }
               else {
                   pairs++;  // increments pairs when duplicate is added.
                   colors.remove(ar[i]);  // removes value from set, because pair has been found.
               }
           }
           return pairs;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] ar = new int[n];
//
//            String[] arItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arItem = Integer.parseInt(arItems[i]);
//                ar[i] = arItem;
//            }
            int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
            int n = 9;
            int result = sockMerchant(n, ar);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();

            //scanner.close();
        }
    }


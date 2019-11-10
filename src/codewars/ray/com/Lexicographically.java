package codewars.ray.com;

import java.util.ArrayList;
import java.util.Collections;

public class Lexicographically {

    public static void main(String[] args) {

        String x = getSmallestAndLargest("thequickbrownfox", 3);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int size = k;
        String[] tokens = s.split("(?<=\\G.{" + size + "})");  // \\G beginning of string or next match
        ArrayList<String> x = new ArrayList<String>(tokens.length);

        for ( String val : tokens) {
            x.add(val);
        }

        Collections.sort(x);
        smallest = x.get(0);
        largest = x.get(x.size() - 1);
        return largest + "\n" + smallest;
    }
}
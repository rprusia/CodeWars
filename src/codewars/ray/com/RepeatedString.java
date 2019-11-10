package codewars.ray.com;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {

    static long repeatedString(String inputString, long numberOfRepeats) {

        long check = 0;
        int i=0,j=0,k=0;
        long count = 0;

        for(i=0; i<inputString.length(); i++){
            if(inputString.charAt(i) == 'a')
                count++;
        }

        long div = numberOfRepeats / inputString.length();
        long reminder = numberOfRepeats % inputString.length();

        count = div * count;

        for(i=0; i < reminder; i++){
            if( inputString.charAt(i) == 'a')
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "aba";
        long n = s.length();

        repeatedString(s, n);
    }

}

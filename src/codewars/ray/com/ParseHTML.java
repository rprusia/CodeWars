package codewars.ray.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseHTML {

    public static void main(String[] args){

        Boolean matchFound = false;
        String line = "<h1>This is a line</h1>";

        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher match = pattern.matcher(line);

        while(match.find()){

            System.out.println(match.group(2));
            matchFound = true;

        }
        if (!matchFound) {
            System.out.println("None");
        }

    }
}

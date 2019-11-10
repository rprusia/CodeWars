package codewars.ray.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_IP {

    public static void main(String[] args){

        /*
        [01]?\\d{1,2} matches numbers 0-199;
        2[0-4]\\d
        25[0-5]
         */
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." + num + "." + num + "." + num;

        System.out.println(pattern);

    }

//    class MyRegex {
//        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5]))";
//        String pattern = num + "." + num + "." + num + "." + num;
//    }
}

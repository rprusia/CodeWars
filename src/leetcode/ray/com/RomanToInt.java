package leetcode.ray.com;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s){
        Map<Character,Integer> map = new HashMap();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if ( i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                // remove value twice, because it was previously added. Which is why 2 * is in algorithm
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        romanToInt("XXII");

    }
}

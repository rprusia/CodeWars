package codewars.ray.com;

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length)
                return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] char_frequencies = new int[26];

        for (int i = 0; i < a_length; i++) {
            char current_char = a.charAt(i);
            int index = current_char-'a';
            char_frequencies [index]++;
        }

        for (int i = 0; i < b_length; i++) {
            char current_char = b.charAt(i);
            int index = current_char-'a';
            char_frequencies [index]--;
        }

        for (int i = 0; i < 26; i++) {
            if (char_frequencies[i] != 0) return false;
        }
        return true;




    }

    public static void main(String[] args) {

        boolean ret = isAnagram("hello", "Hello");

    }
}


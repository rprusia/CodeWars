package leetcode.ray.com;

// reverse a integer, NO NEED TO CONVERT TO STRING OR ARRAY
public class ReverseInt {
        public static int reverse(int x) {

            int reversed = 0;
            int pop;

            while( x != 0){
                pop = x % 10;    // get last digit
                x /= 10;   // divide by 10 to get to next digit

                // Integer.MAX_VALUE and Integer.MIN_VALUE need to be divided by 10 to convert back to int.
                if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7) return 0;
                if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8) return 0;

                reversed = (reversed * 10 ) + pop;
            }
            return reversed;
        }


        public static void main(String[] args) {

            int y = reverse(799);
        }
    }


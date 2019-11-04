public class Palindrome {

    public static void main(String[] args) {

        String str = "harrwah";
        System.out.print(isPalindrome(str));
    }
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toUpperCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            if (forwardChar != backwardChar)
                return false;
        }
        return true;

    }


}

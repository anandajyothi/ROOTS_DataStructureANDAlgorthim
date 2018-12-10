
package ds.string;

public class PalidromString {

    public static boolean longestPalindrome( String s) {

        if (s == null || s.isEmpty()) {
            return false;
        } else if (s.length() == 1) {

            return true;
        }

        char[] input = s.toCharArray();

        for ( int i = 0; i < input.length / 2; i++) {

            if (input[i] != input[(input.length - 1) - i]) {

                return false;
            }
        }

        return true;

    }

    public static void main( String[] args) {

        System.out.println(longestPalindrome("abcddba"));

    }

}

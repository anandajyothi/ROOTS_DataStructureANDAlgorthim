
package ds.string;

public class StringUniqueUsingArray {

    public static void main( String[] args) throws Exception {

        String input = "madam";

        System.out.println(isUnique(input));

    }

    public static boolean isUnique( String input) throws Exception {
        int[] ascii = new int[256];

        if (input == null || input.isEmpty()) {
            throw new Exception("not a valid input");
        }

        char[] in = input.toCharArray();

        for ( int i = 0; i < in.length; i++) {

            if (ascii[in[i]] > 0) {
                return false;
            }
            ascii[in[i]] = in[i];
        }

        return true;
    }
}


package ds.string;

public class ReplaceSpace {

    /**
     * @param args
     */

    public static void main( String[] args) {

        String input = "Mr John Smith";

        char[] in = input.toCharArray();

        String output = "";

        int count = 0;
        for ( int i = 0; i < in.length; i++) {

            if (in[i] == ' ') {

                count++;
            } else {
                if (count > 0) {
                    output += "%20";
                    count = 0;
                }
                output += in[i];

            }

        }
        if (count > 0) { // if string has space at the end
            output += "%20";
        }

        System.out.println(output);

    }

}

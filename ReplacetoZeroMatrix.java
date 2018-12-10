
package ds.string;

import java.util.HashSet;

public class ReplacetoZeroMatrix {

    /**
     * @param args
     */

    public static void main( String[] args) {

        int[][] input = { { 1, 2, 0 }, { 2, 4, 5 }, { 3, 1, 1 } };

        HashSet<Integer> izeros = new HashSet<>();
        HashSet<Integer> jzeros = new HashSet<>();

        for ( int i = 0; i < input.length; i++) {

            for ( int j = 0; j < input.length; j++) {

                if (input[i][j] == 0) {

                    izeros.add(i);
                    jzeros.add(j);

                }

            }
        }

        for ( int i = 0; i < input.length; i++) {

            for ( int j = 0; j < input.length; j++) {
                if (izeros.contains(i) || jzeros.contains(j)) {

                    //System.out.println("i:" + i + ", " + "j:" + j);
                    input[i][j] = 0;
                    System.out.println("[i: " + i + ", j: " + j + "]" + input[i][j]);
                }

            }
        }

        System.out.println(input);

    }

}

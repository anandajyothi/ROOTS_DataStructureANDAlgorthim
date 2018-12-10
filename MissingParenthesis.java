
package ds.stackANDqueue;

import java.util.HashMap;
import java.util.Stack;

public class MissingParenthesis {

    /**
     * @param args
     */

    public static void main( String[] args) {

        HashMap<Character, Character> verify = new HashMap<>();

        verify.put('(', ')');
        verify.put('{', '}');

        String input = "2*(3+5(sadfeghtyhiur)";

        Character output = getMissingParanthesis(input, verify);

        System.out.println(output);
    }

    public static Character getMissingParanthesis( String input, HashMap<Character, Character> verify) {

        Character out = null;

        char[] fI = input.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for ( int i = 0; i < fI.length; i++) {

            if (verify.get(fI[i]) != null) {

                stack.push(fI[i]);

            }
            if (verify.get(fI[i]) != null && verify.get(fI[i]) == fI[i]) {

                stack.pop();
            }

        }
        out = verify.get(stack.pop());
        return out;

    }

}
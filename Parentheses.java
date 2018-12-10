
package ds.stackANDqueue;

import java.util.HashMap;
import java.util.Stack;

public class Parentheses {

    /**
     * @param args
     */

    public static void main( String[] args) {

        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid( String s) {

        char[] input = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> checker = new HashMap<>();
        checker.put('}', '{');
        checker.put(']', '[');
        checker.put(')', '(');

        for ( int i = 0; i < input.length; i++) {

            if (stack.isEmpty()) {
                stack.push(input[i]);
            } else {
                if (checker.get(input[i]) == stack.peek()) {

                    stack.pop();
                } else {
                    stack.push(input[i]);
                }

            }

        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

}

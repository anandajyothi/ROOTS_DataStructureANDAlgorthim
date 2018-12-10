
package ds.stackANDqueue;

import java.util.Stack;

public class QueueImplUsingStack {

    Stack<Integer> stack = null;

    private QueueImplUsingStack() {

        stack = new Stack<Integer>();
    }

    public void enqueue( Integer data) {

        stack.push(data);
    }

    public Integer dequeue() {

        Stack<Integer> stack2 = new Stack<Integer>();

        if (!(stack2.isEmpty())) {

            stack2.pop();
        } else if (!(stack.isEmpty())) {
            while (!(stack.isEmpty())) {
                stack2.push(stack.pop());
            }
            stack2.pop();
        }

        return -1;
    }

    /**
     * @param args
     */

    public static void main( String[] args) {

    }

}

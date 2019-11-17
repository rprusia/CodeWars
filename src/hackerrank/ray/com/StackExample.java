package hackerrank.ray.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExample {


    /**
     * Object push(Object element) : Pushes an element on the top of the stack.
     *
     * Object pop() : Removes and returns the top element of the stack. An ‘EmptyStackException’
     * exception is thrown if we call pop() when the invoking stack is empty.
     *
     * Object peek() : Returns the element on the top of the stack, but does not remove it.
     *
     * boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.
     *
     * int search(Object element) : It determines whether an object exists in the stack.
     * If the element is found, it returns the position of the element from the top of the stack. Else, it returns -1.
     *
     */
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();  // last-in-first-out

        stack.push('1');
        stack.push('2');
        stack.push('3');
        stack.push('4');

        System.out.println("Peek looks at last element added in stack, Stacks are last-in-first-out :" + stack.peek());

        stack.pop();
        System.out.println("The stack pop removes last element off the queue :" + stack.peek());

        // Searching element in the stack
        // stack search returns -1 if element is not found.
        Integer pos = (Integer) stack.search('4');

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);

        if (stack.empty()) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is NOT empty");
        }


    }
}

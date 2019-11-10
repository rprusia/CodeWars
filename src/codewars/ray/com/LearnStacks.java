package codewars.ray.com;

import java.util.Stack;

public class LearnStacks {

    public static void main(String[] args) {

        // stack is FILO, last in first out
        Stack<String> stringStack = new Stack<String>();

        stringStack.push("first");
        stringStack.push("second");
        stringStack.push("last");

        if (!stringStack.empty()){

            System.out.println(stringStack.peek() + " peek");  // returns last item in stack without removing.
            System.out.println(stringStack.pop() + " pop");  // returns last item in stack and removes it.
            System.out.println(stringStack.push("new") + " push");  // places item on stack, at last positon
            System.out.println(stringStack.pop() + " pop"); // returns last item in stack and removes it.
            System.out.println(stringStack.pop() + " pop"); // returns last item in stack and removes it.

        }


    }
}

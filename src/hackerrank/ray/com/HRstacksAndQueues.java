package hackerrank.ray.com;

import java.util.*;

public class HRstacksAndQueues {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<Character>();  // LIFO
        stack.push('c');
        stack.push('d');
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i=0; i<5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-"+q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);



    }
}

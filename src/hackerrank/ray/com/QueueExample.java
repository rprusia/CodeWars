package hackerrank.ray.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        // FIFO or the First-In-First-Out principle.
        Queue<Integer> q = new LinkedList<>();

        for ( int i = 0; i < 5; i++){
            q.add(i);
        }

        // Display contents of the queue.
        System.out.println("Elements of queue-"+q);

        // To remove the head of queue.
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
}

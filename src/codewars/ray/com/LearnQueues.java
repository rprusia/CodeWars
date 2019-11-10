package codewars.ray.com;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueues {

    public static void main(String[] args) {
        // queue is a java interface and cannot be instantiated, so assign a linked list to it.
        // queue is FIFO, where stack is FILO
        Queue<Integer> x = new LinkedList<>();

        for (int i = 0; i <= 3; i++) {
            x.add(i);
        }

        int head = x.peek();
        System.out.println("Current head value " + head);  // peek at first value, but does not remove it.
        System.out.println("using elment() " + x.element());  // simlar to peek but throws NoSuchElementException if que is empty.
        //x.remove();  // removes and returns the head of the que throws NoSuchElementException if que is empty.


        while (!x.isEmpty()) {
            head = x.poll();
            System.out.println("CurrentValue " + head);
            System.out.println("Size " + x.size());
        }

        x.add(110);
        head = x.peek();
        System.out.println(head);
        x.remove();
        try {

            if (x.isEmpty()) {
                System.out.println("100 has been removed.");
            }
        }
        catch (Exception e) {

            System.out.println("java.util.NoSuchElementException");
        }

    }
}

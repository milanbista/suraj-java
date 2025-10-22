package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        //queue
        //first come first serve
        //fifo -- first in first out

        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(12);
        queue.add(45);

        //poll return and remove element
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        // backen
        //ticket book
        //transcation
        //logs

    }
}

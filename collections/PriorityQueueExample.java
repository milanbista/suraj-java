package collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(4);
        pq.add(10);
        pq.add(1);
        pq.add(7);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        //comparable and comparator

    }
}

class Student{
    int age;
    int height;
}

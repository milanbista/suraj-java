package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {
    public static void main(String[] args) {

        Deque<Integer> dq = new LinkedList<>();
        dq.push(1);
        dq.push(3);
        dq.push(5);

        System.out.println(dq.pop());
        System.out.println(dq.getLast());
        System.out.println(dq.pop());

    }
}

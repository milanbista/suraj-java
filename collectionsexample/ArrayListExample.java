package collectionsexample;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> l = new ArrayList<>(5);
        l.add(4);
        System.out.println();

        Queue<Integer> pq = new PriorityQueue<>(new MyComparator());

        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(4);

        System.out.println(pq.poll());
    }
}


class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}



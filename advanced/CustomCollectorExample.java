package advanced;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectorExample {
    static class Result {
        int sum;
        int count;

        Result(int sum, int count) { this.sum = sum; this.count = count; }

        public String toString() { return "sum=" + sum + ", count=" + count; }
    }

    public static void main(String[] args) {

        Collector<Integer, int[], Integer> collector = Collector.of(
                () -> new int[1],
                (a, m)->{
                    a[0] = a[0] + m;
                },
                (ag1, ag2) ->{
                     ag1[0] += ag2[0];
                     return ag1;
                },
                a -> a[0]
        );


        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2);

        System.out.println( numbers.stream().parallel().collect(collector));

    }
}




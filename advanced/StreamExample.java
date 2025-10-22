package advanced;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

       Stream<Integer> stream =  Stream.of(1,2,3,4,5);
       int r =  stream.reduce(0, Integer::sum);
    }
}

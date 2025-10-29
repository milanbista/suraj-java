package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        //streams
        // streams is a sequence of elements with functional style operations
        // streams three parts
        // 1. source
        // 2. intermediate operation
        // 3. terminal operators

        //intermediate operators
        // filter  ---- filter out the element return true or false
        // map ---- transform the element
        // flatmap() ----
        // distinct
        // sorted()
        // limit()
        // skip()

        //Terminal Operators
        // count()
        // forEach()
        // collect()
        // findFirst() fintAny()
        // anyMatch()
        // toList()
        // reduce();



//        Stream<Integer> nums = Stream.of(3,4,1,5,4, 2);
//        long n =  nums.filter(x -> {
//            if(x % 2 == 0){
//                return true;
//            }
//            else {
//                return false;
//            }
//        } ).count();


        //nums.filter(x -> x % 2 == 0).map(x -> x -3).distinct().forEach(x -> System.out.println(x));

//        nums.filter(x -> x > 2).skip(2).skip(1).forEach(x -> System.out.println(x));

        List<Integer> lnums = Arrays.asList(3,4,5);
//
//        List<Integer> collect = lnums.stream().map(x -> x * x).toList();
//
//
//        for (Integer n: collect){
//            System.out.println(n);
//        }


        //reduce --- reduction  --- combine elements into one result
//        int a = 100;
//        for (Integer b: lnums){
//            a = a + b;
//        }

        int sum =  lnums.stream().reduce(100,(a, b) -> a + b);
        System.out.println(sum);




    }
}

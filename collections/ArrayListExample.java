package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        //collections framework
        int[] students = new int[5];
        students[0] = 1;
        int n = students[0];
        System.out.println(students.length);

        //arraylist
        //dynamic array

        //oops
        // inheritance, abstraction, encap, polymor

        //primit data types
        //int , double, boolean, float
        //Integer, Double, Boolean, Float
        //class type wrapper

       List<Integer> mylist = new ArrayList<>();
        System.out.println("list empty " + mylist.isEmpty());
       mylist.add(30);
       mylist.add(45);
       mylist.add(12);

       System.out.println(mylist.size());
       mylist.remove(Integer.valueOf(12));

//       System.out.println( mylist.get(1));
//        System.out.println(mylist.contains(22));
//        mylist.isEmpty();
//        mylist.clear();
//        System.out.println("last is empty " + mylist.isEmpty());


    }
}



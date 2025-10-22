package collections;

import java.util.ArrayList;
import java.util.List;

public class StringExample {

    static List<String> names;
    public static void main(String[] args) {

        //arraylist names
        names = new ArrayList<>();

        names.add("a");
        names.add("b");
        names.add("w");
        names.add("t");
        names.add("e");
        names.add("h");
        names.add("i");

       // System.out.println(names.size());
//        names.add(0, "H");
//
//        String v = names.set(0, "A");

        List<String> newArr = names.subList(0, 4);

        System.out.println(names.size());
        names.addAll(newArr);
        //names.addAll(0, newArr);

        System.out.println(" size before + " + names.size());

        try{
            for (String s: names){
                if( s.equals("i"))
                    names.add("j");
            }


        }
        catch (Exception e){
            System.out.println(" ok" + e.toString());
        }


        System.out.println(" size afer change " + names.size());


    }




}

//package collections;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MapExample {
//
//    public static void main(String[] args) {
//        //collections
//        //map
//        //key -- value
//
//        //fruit name
//        //fruit price
//        // fruits =  [ "apple", "banana", "orange"]
//        // fruits_price =  [ 23.00, 12.00, 34.00]
//        // fruit = banana
//        //for ( int i = 0; i< fruits.length; i++ ) if(fruits[i].equals("banana") price = fruits_price[i]
//        // "apple" => 23.00
//        // "banana" => 12.00
//        // "orange" => 34.00
//
//        // .get("banana")
//        List<Integer> fruits =  new ArrayList<>();
//
//        int a = 5;
//        Map<String, Integer> map = new HashMap();
//
//        //insert into map
//        map.put("apple", 23);
//        map.put("banana", 12);
//        map.put("orange", 34);
//
//        //get value by key
//        System.out.println(map.get("banana"));
//
//        //check if key exist
//        System.out.println(map.containsKey("banana"));
//
//        //update
//        int value = map.get("apple");
//        value = value + 1;
//        map.put("apple", map.get("apple") + 1);
//
//        //remove
//        map.remove("orange");
//
//        System.out.println(map);
//
//        //iterate
//        //print values
//        for (String s: map.keySet()){
//            System.out.println(map.get(s));
//        }
//
//       int a =   map.getOrDefault("apple", 4);
//        System.out.println(a);
//
//        for (Integer v : map.values()){
//            System.out.println(v);
//        }
//
//
//
//
//
//    }
//}

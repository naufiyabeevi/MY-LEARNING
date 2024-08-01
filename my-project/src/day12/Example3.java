package day12;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        Map<String, String> hStringStringMap = new HashMap<>();
        // Student id - key
        // Student name - value

        //You can use the put() method of the HashMap class to add new key-value pairs to the HashMap
        hStringStringMap.put("al123", "Joy");
        hStringStringMap.put("p1p34", "Rahul");
        hStringStringMap.put("tu1234", "Tom");

        System.out.println(hStringStringMap);

        /* Get values based on key*/
        String s = hStringStringMap.get("al123");
        System.out.println(s);


        //Adding duplicate key
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 7);
        map.put(4, 5);
        map.put(4, 11);
        map.put(7, 18);
        System.out.println(map);

        // HashMap remove()
        map.remove(2);
        System.out.println(map);

        //Iteration
        //Iterating using for loop
        for (Map.Entry<Integer, Integer> type : map.entrySet()) {
            System.out.println("Key=" + type.getKey() + " " + "Value=" + type.getValue());
        }

        //Iteration - From java 8 onwards
        map.entrySet().forEach(System.out::println);
    }
}

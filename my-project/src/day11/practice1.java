package day11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice1 {


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(11);
        integers.add(76);
        System.out.println(integers);
        integers.add(1, 12);
        System.out.println(integers);
        integers.add(10);
        integers.add(11);
        integers.add(76);
        integers.set(1, 67);
        System.out.println(integers);
        integers.remove(2);
        integers.get(2);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        System.out.println("\n");
        for (Integer obj:integers){
            System.out.println(obj);
        }
        System.out.println("\n");
        integers.forEach(System.out::println);/*for each with method reference*/
        System.out.println("\n");
        integers.forEach(a -> System.out.println(a));//using lambda expressions
    }

}

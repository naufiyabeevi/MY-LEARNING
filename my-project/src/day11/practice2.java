package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class practice2 {
    public static void main(String[] args) {

    List<Integer>integers=new ArrayList<>();
    integers.add(6);
    integers.add(8);
    integers.add(68);
    integers.add(76);
        System.out.println(integers);
        integers.add(1,8);
        System.out.println(integers);
        integers.set(2,5);
        System.out.println(integers);
        integers.remove(1);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        boolean gui= integers.contains(68);
        System.out.println(gui);
        for(Integer hui:integers){
            System.out.println(hui);}

            integers.forEach(s-> System.out.println(s));
            integers.forEach(System.out::println);
            Collections.sort(integers);
            System.out.println(integers);
             System.out.println(integers.get(2));



}}

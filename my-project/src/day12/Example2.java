package day12;

import java.util.Set;
import java.util.TreeSet;

//TreeSet
public class Example2 {
    public static void main(String[] args) {
        /*TreeSet is similar to HashSet except
         that it sorts the elements in the ascending order while HashSet doesn’t maintain any order.*/

        Set<Integer> integers = new TreeSet<>();
        integers.add(7);
        integers.add(1);
        integers.add(11);
        integers.add(3);
        System.out.println(integers);
    }
}

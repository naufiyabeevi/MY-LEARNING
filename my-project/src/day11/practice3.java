package day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class practice3 {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        integers.add(3);
        integers.add(7);
        integers.add(8);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

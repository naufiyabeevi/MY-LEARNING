package day14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example5 {
    public static void main(String[] args) {
        //program to print elements of an array in descending order?
        Integer[] array = {6, 7, 0, 1, 3};
        Comparator<Integer> objectComparator = Collections.reverseOrder();
        Arrays.sort(array, objectComparator);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

package day15;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

//iterator
public class practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(12);
        number1.add(13);
        number1.add(14);
        number1.add(15);
        System.out.println(number1);
        Iterator<Integer> it = number1.iterator();
        while (it.hasNext()) {

        }
        System.out.println(it.next());



    }
}







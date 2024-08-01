package day11;

import java.util.Iterator;
import java.util.LinkedList;

//Linked List
public class Example2 {
    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(77);
        integerList.add(11);
        integerList.add(1);
        integerList.remove(1);
        //   //Iterating LinkedList using Iterator
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) { //true
            System.out.println(iterator.next());
        }

        // To remove first element
        integerList.removeFirst();

        //Removing Last element
        integerList.removeLast();


    }
}

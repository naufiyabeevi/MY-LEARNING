package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Arraylist
public class Example1 {
    public static void main(String[] args) {

        //An array has a fixed length so if it is full you cannot add any more elements to it
        int[] obj = {11, 42, 3};
        //obj[3] = 6;
        //System.out.println(obj[3]);

        //ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //Wrapper classes

        //int - Integer
        //byte - Byte
        //short - Short
        //float - Float
        //double - Double
        //long - Long
        //char - Character

        //Arraylist can grow and shrink dynamically while an array cannot.
        List<Integer> integers = new ArrayList<>();// array list object is created

        // If you want to add the element at the end of the List then you can simply call the add() method like this
        integers.add(11);
        integers.add(42);
        integers.add(3);
        integers.add(6);
        integers.add(1233);
        integers.add(null);
        integers.add(null);
        integers.add(6);
        integers.add(55);
        integers.add(55);

        integers.add(123); // 11 the element
        System.out.println(integers);
        //  newcapacity = (oldCapacity * 3/2) + 1 == 10 * 3/2 + 1

        List<Integer> integerArrayList = new ArrayList<>(1000); // initial capacity 1000


        System.out.println("\n");

        List<String> strings = new ArrayList<>();

        strings.add("Earth");// 0
        strings.add("Jupiter"); //1
        strings.add("Pluto");//2

        //To add the element at the specified location in ArrayList,
        // you can specify the index in the add() method like this:
        strings.add(1, "Mars"); // 1

        System.out.println(strings);
        System.out.println("\n");
        //You can use the set method to change an element in ArrayList. You need to provide the index and new element,
        // this method then updates the element present at the given index with the new given element.
        strings.set(3, "Venus");
        System.out.println(strings);

        System.out.println("\n");
        //Array size
        System.out.println(strings.size());

        //You can use remove() method to remove elements from an ArrayList.
        strings.remove(0);
        System.out.println("\n");
        System.out.println(strings);
        System.out.println("\n");
        // To access an emelement from oth position use get() method
        System.out.println(strings.get(0));
        System.out.println("\n");
        //Iterating ArrayList

        //Normal for loop
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("\n");

        //Advance for loop
        for(String d:strings){ // for(type of element: collection/array object)
            System.out.println(d);
        }
        System.out.println("\n");
        //From java 8 onwards you can use for-each
        strings.forEach(System.out::println); //Using method reference
        System.out.println("\n");

        List<String> strings1 = new ArrayList<>();
        strings1.add("Galaxy");
        strings1.add("Universe");
        strings1.add("Milkiy way");
        strings1.add("Alpha");
        System.out.println(strings1);

        //Using Collection.sort we can sort elements in alphabetic order
        Collections.sort(strings1);
        System.out.println(strings1);

        boolean alpha = strings1.contains("Alpha");
        System.out.println(alpha);


    }
}

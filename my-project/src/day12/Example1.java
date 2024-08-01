package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Set - HashSet
public class Example1 {
    public static void main(String[] args) {

        System.out.println("\n");
        Set<Integer> hashset = new HashSet<>();

        // HashSet will not allow duplicates
        hashset.add(9);
        hashset.add(9);
        hashset.add(11);
        hashset.add(99);
        ////Addition of null values
        hashset.add(null);
        hashset.add(null);
        System.out.println(hashset);
        System.out.println("\n");

        Set<Character> characters = new HashSet<>();
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('p');
        System.out.println(characters);

        //Iteration
        for(Character c:characters){
            System.out.println(c);
        }

        //Java 8 onwards foreach
        characters.forEach(System.out::println);


        // Removing elements
        characters.remove('a');
        System.out.println(characters);


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(7);

        // Converting array list(collection) to set
        //HashSet(Collection)
        Set<Integer> integers = new HashSet<>(integerArrayList);

    }
}

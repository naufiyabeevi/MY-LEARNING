package day14;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        //program to sort numbers in natural order using sort method?
        int[]array={7,8,0,1,3,4};
        System.out.println("before sorting="+array);
        for(Integer i:array ){
            System.out.println(i);
        }
        Arrays.sort(array);
        System.out.println("\n");
        for(Integer i:array ){
            System.out.println(i);
        }
    }
}

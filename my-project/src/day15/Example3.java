package day15;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        //java program to check to strings are anagram?
        String e1 = "Race";
        String e2 = "Care";
        Action obj =new Action();
        Boolean r4 = obj.methoddz(e1,e2);
        System.out.println(r4);
        String t1 = "Malayalam";
        String s2 = "English";
        Boolean r5 =obj.methoddz(t1,s2);
        System.out.println(r5);

        //first convert to strings are lower case
        //then convert string to character array
        //then sort array in natural order
        //then check arrays are equal
    }
}

class Action {
    Boolean methoddz(String e1, String e2) {
        String s1 = e1.toLowerCase();
        String s2 = e2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        Boolean status = Arrays.equals(c1, c2);
        return status;


    }
}

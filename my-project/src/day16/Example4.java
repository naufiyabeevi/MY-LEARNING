package day16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {
        //Java program to check palindrome or not?
        String word = "racecar";
        String word2 = "";
        for (int i = 0; i < word.length(); i++) {
            word2 = word.charAt(i) + word2;
        }
        System.out.println(word2);
        if (word.equals(word2)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }
        //Java program to Reverse word in a string?
        String word3 = "happy";
        String word4 = "";
        for (int i = 0; i < word3.length(); i++) {
            word4 = word3.charAt(i) + word4;
        }
        System.out.println(word4);

        //Program to find number of elements in an array?
        int[] array = {4, 8, 12, 67, 89, 90, 54, 34, 56};
        System.out.println(array.length);
        //java program to add the elements of an array?
        int[] arrays = {6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        System.out.println(sum);
        //java program to calculate average of numbers using array?
        int[] arra = {5, 10, 15, 20, 25};
        int sumss = 0;
        for (int num : arra) {
            sumss += num;
        }
        System.out.println(sumss / arra.length);
        //java program to convert char array to string array?
        char[] arrayes = {'b', 'a', 'l', 'o', 'o', 'n'};
        String strss = new String(arrayes);
        System.out.println(strss);


    }
}

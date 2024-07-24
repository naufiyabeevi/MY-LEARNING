package day3;

public class Example2 {
    public static void main(String[] args) {

        //String
        String name = "Sibin";

        //Length of a string
        System.out.println(name.length());

        // To upper case
        System.out.println(name.toUpperCase());

        // To lower case
        System.out.println(name.toLowerCase());

        // indexof method
        String str = "I am sibin hi"; //0 1 2 3 4 5
        System.out.println(str.indexOf("hi"));

        //Concatenation
        String s1 = "Virat";
        String s2 = "Kohli";
        System.out.println(s1 +" "+ s2); //Virat Kohli

        //concat
        String s3 = "Sachin";
        String s4 = "Tendulkar";
        String resutl = s3.concat(s4);
        System.out.println(resutl);

        System.out.println("5"+"5"); //55
        System.out.println(5+5);//10


    }
}
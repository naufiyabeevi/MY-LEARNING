package day8;

public class Example1 {

    int age; // attribute

    //Constructor
    //A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created.

    public Example1() {
        age = 21;
    }

    //Constructor can be used to set initial values for object attributes:

    public static void main(String[] args) {
        Example1 example1 = new Example1(); // object initialised
        System.out.println(example1.age);
    }
}

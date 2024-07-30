package day9;

// Variable scope - todays topic
//There are four scopes for variables in Java: local, instance, and class.
public class Example1 {

    // Within a class, but outside of any methods, constructors, or blocks,
    // instance variables are declared. They are accessible to all methods and blocks
    // in the class and are a part of an instance of the class. If an instance variable
    // is not explicitly initialised, its default values are false for boolean types,
    // null for object references, and 0 for numeric kinds. Until the class instance is destroyed,
    // these variables' values are retained.
    int x = 9; // Instance variable
    String ss; // null is the default value of an object
    int i; // 0 is the default value
    boolean bool; // false is the default value


    // In a class but outside of any method, constructor, or block,
    // the static keyword is used to declare class variables, also referred to as static variables.
    static int b = 9; // Static varaible or class variable


    // Local variables are those that are declared inside of a method, constructor, or code block.
    // Only the precise block in which they are defined is accessible.
    // The local variable exits the block's scope after it has been used, and its memory is freed.
    public static void main(String[] args) {
        int j = 4; // Local Variable
        Example1 obj = new Example1();
        System.out.println(obj.x);
        System.out.println(obj.ss);
        System.out.println(obj.i);
        System.out.println(obj.bool);

        int i = Example1.b;
        System.out.println(i);
    }

    public void doSomething() {
        int i = 9;// Local Variable
    }

    public Example1() {
        int k = 7; // Local Variable
    }

    { // code block
        int c = 5; // Local Variable
    }
}

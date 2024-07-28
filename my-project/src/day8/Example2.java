package day8;

public class Example2 {

    int age; // attribute

    // All classes have constructors by default: if you do not create a class constructor yourself,
    // Java creates one for you.


    public Example2() {
        // However, then you are not able to set initial values for object attributes.
        age = 22;
    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        System.out.println(example2.age);

    }
}

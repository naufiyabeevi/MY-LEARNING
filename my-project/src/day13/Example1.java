package day13;

// Exception handling - ArrayIndexOutOfBoundsException
public class Example1 {

    public static void main(String[] args) {

        int[] ints = {6, 1, 4};//[0][1][2]
        System.out.println(ints[2]);

        try {//The try statement allows you to define a block of code
            // to be tested for errors while it is being executed.
            System.out.println(ints[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //The catch statement allows you to define a block of code to be executed,
            // if an error occurs in the try block.
            System.out.println(e.getMessage());
        }
        System.out.println("Done");
    }
}

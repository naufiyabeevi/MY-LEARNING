package day13;

//throw
public class Example4 {
    public static void main(String[] args) {

        //The Java throw keyword is used to throw an exception explicitly.
        //We specify the exception object which is to be thrown.

        // Program to check eligibilty of voting
        int age = 20;
        if (age < 18) {
            throw new ArithmeticException("You are not eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
        System.out.println("Done");
    }
}

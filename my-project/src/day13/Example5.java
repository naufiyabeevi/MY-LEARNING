package day13;

//Example 5
public class Example5 {
    public static void main(String[] args) {

        //Program to check the length of the string greater than 2 or else throw an exception
        String name = "Mo";
        if (name.length() > 2) {
            System.out.println("Valid name");
        } else {
            throw new StringLengthInvalid("Not valid");
        }
    }
}


//Creating custom exception
class StringLengthInvalid extends RuntimeException {

    public StringLengthInvalid(String message) {
        super(message); // We are invoking parent class(RuntimeException) constructor
    }
}
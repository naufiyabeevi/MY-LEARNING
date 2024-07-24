package day3;

public class Example4 {

    public static void main(String[] args) {

        //Java If ... Else

        int num = 9;
        int h = 8;

        //Use if to specify a block of code to be executed, if a specified condition is true
        if (h > num) { // false
            System.out.println("Inside if block");
        } else if (h == num) { //False - Use else if to specify a new condition to test, if the first condition is false
            System.out.println("Inside else if block");

        } else { //Use else to specify a block of code to be executed, if the same condition is false
            System.out.println("Inside else block");
        }
    }
}
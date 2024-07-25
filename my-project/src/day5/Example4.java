package day5;

public class Example4 {
    public static void main(String[] args) {
        //java program to reverse a number?
        int num = 123;
        int reversed = 0;

        while (num != 0) { //true true true false
            int digit = num % 10; // 3 2 1
            reversed = reversed * 10 + digit; //  3 32 321
            num = num / 10; // 12 1 0
        }

        System.out.println(reversed);
    }


}

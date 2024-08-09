package day16;

public class Example3 {
    public static void main(String[] args) {
        //Hello World Program
        System.out.println("hello world");
        //Addition OF Two Numbers
        int num = 5;
        int num1 = 2;
        int sum = num + num1;
        System.out.println("sum of 5 and 2 is" + sum);
        //TERNARY OPERATOR
        //Find Maximum Of Three Numbers
        int num3 = 10;
        int num4 = 20;
        int num5 = 15;//
        int maximumvalue = ((num3 > num4 && num3 > num5) ? num3 : (num4 > num3 && num4 > num5) ? num4 : num5);
        System.out.println(maximumvalue);
        //Find Maximum Value Of Four Numbers?
        int num6 = 7;
        int num8 = 9;
        int num9 = 21;
        int num10 = 13;
        int maximumvalues = ((num6 > num8 && num6 > num9 && num6 > num10) ? num6 : (num8 > num9 && num8 > num10 && num8 > num6 ? num8 : (num9 > num10 && num9 > num6 && num9 > num8) ? num9 : num10));
        System.out.println(maximumvalues);
        //check even or odd number
        int num11 = 31;
        if (num11 % 2 == 0) {
            System.out.println("it is a even number");
        } else {
            System.out.println("it is a odd number");
        }
        //factorial of a number
        int num12 = 5;
        int factorial = 1;
        for (int i = 1; i <= num12; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        //print pattern in java
        int column = 6;
        for (int i = 1; i <= column; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
        //Multiply two numbers in java
        double first = 2.5;
        double second = 5.5;
        double product = first * second;
        System.out.println(product);
        //Check vowel or consonant in java?
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("It is vowel");
        } else {
            System.out.println("It is a consonant");

        }
        //Find a Quotient and Remainder In Java
        int digit = 17;
        int digit1 = 5;
        int quotient = digit / digit1;
        System.out.println(quotient);
        int remainder = digit % digit1;
        System.out.println(remainder);
        //Java Program to convert char to string and string  to char?
        char letter = 'y';//char to string
        String convert = Character.toString(letter);
        System.out.println(convert);
        String word = "Environment";
        char converts = word.charAt(10);
        System.out.println(converts);
    }
}
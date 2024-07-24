package day2;

public class Example1 {


    public static void main(String[] args) {

        //data type variableName = value;
        //Non-primitive data types
        String myName = "Sibin";

        //Primitive data types
        byte age = 99;
        short num1 = 10000;
        int num2 = 1000000000;
        long num3 = 4503599627370496L;
        float num4 = 3.14F;
        double num5 = 4503599627370496.344534;

        char letter = 'A';

        boolean status = true; // or false;


        //Exmple-1: Create a variable called name of type String and assign it the value Sibin:
        String name = "Sibin";
        System.out.println(name);

        //Example-2: You can also declare a variable without assigning the value, and assign the value later:
        int myNumber;
        myNumber = 99;
        System.out.println(myNumber);

        //Note that if you assign a new value to an existing variable, it will overwrite the previous value:
        int aNumber = 88;
        aNumber = 12;
        System.out.println(aNumber);

        /*
        If you don't want others (or yourself) to
        overwrite existing values, use the final keyword
        (this will declare the variable as "final" or "constant",
        which means unchangeable and read-only):
         */
        final int age2 = 22;
        //age2 = 21;
        System.out.println(age2);


        //To combine both text and a character, use the + variable:
        String hello = "Hello";
        System.out.println(hello + "World"); //

        //You can also use the + character to add a variable to another variable:
        int n1 = 3;
        int n2 = 4;
        System.out.println(n1 + n2); // 7


        //declare multiple variable
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        System.out.println(number1 + number2 + number2 + number3); // 1 + 2 + 2 + 3 = 8

        //To declare more than one variable of the same type, you can use a comma-separated list:
        int numb1 = 1, numb2 = 2, numb3 = 3, numb4 = 9;
        System.out.println(numb1 + numb2 + numb3);

        //You can also assign the same value to multiple variables in one line:
        int a, b, c;
        a = b = c = 10;
        System.out.println(c);


        //All Java variables must be identified with unique names.
        float salary = 5000.45f;

        //Names can contain letters, digits, underscores, and dollar signs
        //Names must begin with a letter
        //Names should start with a lowercase letter, and cannot contain whitespace
        //Names can also begin with $ and _
        //Names are case-sensitive ("myVar" and "myvar" are different variables)
        String country = "India";
        String state6 = "kerala";
        int $age = 50;
        float _pi = 3.14f;

        // Reserved words (like Java keywords, such as int or boolean) cannot be used as names
        //int final = 9;

        //Boolean
        boolean isJavaFun = true;
        boolean isJavaBoring = false;
        System.out.println(isJavaBoring);

    }
}

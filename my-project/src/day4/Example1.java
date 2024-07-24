package day4;

public class Example1 {
    public static void main(String[] args) {

        //Java While Loop
        //The while loop loops through a block of code as long as a specified condition is true:
        //Example
        int i = 4; // 4
        while(i>0){ // 4>0 true 3>0 true 2>0 true 1>0 true 0>0 false
            System.out.println("Hi");
            i--; // decrement 3 2 1 0
        }


        System.out.println("\n");


        //program to print first five natural numbers (1 2 3 4 5)
        int j = 1;
        while(j<=5){
            System.out.println(j);
            j++; //increment
        }

        System.out.println("\n");

        //Java Do/While Loop
        //This loop will execute the code block once,
        // before checking if the condition is true, then it will repeat the loop as long as the condition is true.

         //Java program to print 5 4 3 2 1

        int k = 5;
        do{
            System.out.println(k);
            k--; //
        }while(k>=1);


        System.out.println("\n");

        //For loop
        //Program to print first 5 natural number

        for(int n=1;n<=5;n++){
            System.out.println(n); // 1 2 3 4 5
        }
    }
}

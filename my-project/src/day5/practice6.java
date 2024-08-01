package day5;

public class practice6 {
    public static void main(String[] args) {
        //write a java program to print even numbers between 1 and 20?
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        // WRITE A JAVA PROGRAM TO PRINT NUMBERS BETWEEN 1 AND 25 WHERE NUMBERS SHOULD BE DIVISIBLE BY 3?
        for (int j = 1; j <= 25; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("\n");
        //find a factorial of a number 4?
        int factorial = 1;
        for (int h = 1; h <= 4; h++) {
            factorial = factorial * h;//1 2 6 24
        }
            System.out.println(factorial);

            System.out.println("\n");

        //java program to reverse a number?

        int number=6789;
        int reversed=0;
        while(number!=0){
            int digit = number%10;//9 8 7 6
            reversed=reversed*10+digit;//9 98 987 9876
            number=number/10;//6780 678 67 6 0
        }
        System.out.println(reversed);
        System.out.println("\n");


        //write a program to find sum of5 natural numbers using for loop?
        int num=5;
        int sum=0;
        for(int i=0;i<=num;i++) {

            sum = sum + i;//1+1=1,1+2=2,2+3=6,6+4=10,10+5=15
        }
            System.out.println(sum);
        //write a program to count number of digits in an integer using while loop?
         int numbers=1234;
         int count=0;
                 while(numbers!=0) {
                     numbers = numbers / 10;//123 120 12 10 0
                     count++;//1 2 3 4 5
                 }
                     System.out.println(count);
    }}


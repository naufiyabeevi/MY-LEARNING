package day5;

public class Example7 {
    public static void main(String[] args) {
        //write a program to count number of digits in an integer using while loop?
        int number=1234;
        int count=0;
        while(number!=0){
             number=number/10;//123 12 1 0
             count++;//1 2 3 4
        }
        System.out.println(count);
    }
}

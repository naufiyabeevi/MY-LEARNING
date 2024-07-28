package day5;

public class Practice3 {
    public static void main(String[] args) {


    // write a java program to reverse a number?
    int number1 = 1482;
    int reversed = 0;
    while(number1!=0){
        int digit =number1%10;// 2 8 4 1
        reversed=reversed *10+digit;//2 28 284 2841
        number1=number1/10;//1480 148 14 10 0
        System.out.println(reversed);
    }

    {
    }
}}

package day3;

public class Practice3 {
    public static void main(String[] args) {


        //write a program to check wheather a number is divisible by 6and 12 or not?
        int value = 12;
        if (value % 3 == 0 && value % 6== 0){
            System.out.println("The number is divisible by 3 and 6");
    }else {
            System.out.println("The number is not divisible by 3 and 6");
        }
        System.out.println("\n");
    // write a program to check character is a alphabet or digit?
        int letter =7;
        if(letter>='a'&&letter<='z' ) {
            System.out.println("character is a alphabet");
        }else if(letter>=1&& letter<=9){
            System.out.println("character is a digit");
        }

        System.out.println("\n");
        //write a program to check weather 7 is negative or positive?
          int number =0;
        if(number>0) {
            System.out.println("number is positive");
        } else if(number<0){
            System.out.println("number is negative");
        }else{
            System.out.println("The value is default");
        }
}}



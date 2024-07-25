package day3;

import java.sql.SQLOutput;

public class Rivision {
    public static void main(String[] args) {

        //write a java program to find larger number using if else?
        int a = 7;
        int b = 9;
        if (a > b) {
            System.out.println(a + " is larger number");
        } else {
            System.out.println(b + " is larger number");

            System.out.println("\n");


            //Write a java program to find smallest of three numbers
            int c = 8;
            int d = 7;
            int e = 12;
            if (c < d && c < e) {
                System.out.println(c + "is a smallest number");
            } else if (e< c && e < d) {
                System.out.println(e + "is a smallest number");
            }else {
                System.out.println(d + "is a smallest number");

                System.out.println("\n");

                //Write a java program to find smallest of two number using Math class
                int f = 9;
                int g = 7;
                System.out.println(Math.min(f,g ));
                // java program to find given number 11 is even or odd number?
                int num=11;
                if (num%2==0) {
                    System.out.println(num + "is a even number");
                }else{
                    System.out.println(num+"is a odd number");
                    System.out.println("\n");

                    //write a program to find a  given number 5 is negative or positive no?
                    int hj= 5;
                    if (hj<0) {
                        System.out.println(hj + "it is a negative number");
                    } else if (hj ==0) {
                        System.out.println(hj + "it is a zero value");
                    }else {
                        System.out.println(hj +"it is a postive number");

                    }


                }




            }

        }
    }
}


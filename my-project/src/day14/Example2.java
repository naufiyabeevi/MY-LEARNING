package day14;

public class Example2 {
    public static void main(String[] args) {
        //write a program to swap two numbers without temp variable?
        int a = 4;
        int b = 5;
        b = a+b;//b =9;
        a = b-a;//9-4=5
        b=b-a;//b=9-5=4;
        System.out.println(a);
        System.out.println(b);
    }
}

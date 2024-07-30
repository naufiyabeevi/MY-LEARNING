package day9;

// Build- in packages

import java.util.Scanner; // excplicitly imported


//import java.lang.Math; java.lang package is by default(implicitly) impoerted by java.
public class Example7{

    public static void main(String[] args) {

        int b = 9;
        int c = 7;
        int max = Math.max(b,c);

        Scanner sc = new Scanner(System.in); // It take use input from th console
        System.out.println("Enter your name");

        String str = sc.nextLine();
        System.out.println(str);

    }
}

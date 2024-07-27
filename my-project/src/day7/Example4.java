package day7;

public class Example4 {
    public static void main(String[] args) {
        // Write a java program to print even numbers between 1 to 25
        int input1 = 1;
        int input2 = 25;

        Utility utility = new Utility(); // Object created
        utility.printEvenNumbers(input1, input2);  // Method called, return type is void

    }
}

class Utility {

    // Void return type - return nothing
    void printEvenNumbers(int i1, int i2) {
        for (int i = i1; i <= i2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
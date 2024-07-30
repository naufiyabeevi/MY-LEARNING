package day10;

// Polymorphism
public class Example2 { // Method Overloading example

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.sum(6, 7);
        System.out.println(sum);
    }
}

class Calculator {


    // Method Overloading in Java – This is an example of compile time (or static polymorphism)
    int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    float sum(float a, float b) {
        float f = a + b;
        return f;
    }

    double sum(double a, double b) {
        double s = a + b;
        return s;
    }
}

// https://beginnersbook.com/2013/03/polymorphism-in-java/
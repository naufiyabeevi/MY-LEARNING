package day7;


// Static method example
// static means that the method belongs to the Main class and not an object of the Main class
public class Example3 {
    public static void main(String[] args) {
        int i = 4;
        int b = 2;
        int sum = Calculator.sum(i,b);// sum method is called
        System.out.println(sum);

        float f1 = 4.6f;
        float f2 = 1.2f;
        float sum1 = Calculator.sum(f1, f2);

        System.out.println(sum1);

        double d1 = 4444.5555;
        double d2 = 43443.3434;
        double sum3 = Calculator.sum(d1, d2);
        System.out.println(sum3);
    }
}

class Calculator {
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static float sum(float n, float u) {
        float s = n + u;
        return s;
    }

    static double sum(double n, double u) {
        double s = n + u;
        return s;
    }
}
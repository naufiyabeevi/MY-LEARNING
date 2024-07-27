package day7;

public class Example2 {
    public static void main(String[] args) {
        //Create a calculator
        int num1 = 2;
        int num2 = 4;

        Calc calc = new Calc();
        int sum = calc.sum(num1, num2);
        System.out.println(sum);

        float f1 = 4.6f;
        float f2 = 1.2f;
        float sum1 = calc.sum(f1, f2);

        System.out.println(sum1);

        double d1 = 4444.5555;
        double d2 = 43443.3434;
        double sum3 = calc.sum(d1, d2);
        System.out.println(sum3);
    }
}

class Calc {

    int sum(int n, int u) {// return type int

        int s = n + u;
        return s;
    }

    float sum(float n, float u) {
        float s = n + u;
        return s;
    }

    double sum(double n, double u) {
        double s = n + u;
        return s;
    }
}
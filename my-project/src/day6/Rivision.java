package day6;

public class Rivision {
    public static void main(String[] args) {
        int m = 4;

        Maths equation = new Maths();
        int house = equation.findOfExpression(m);
        System.out.println(house);
    }
}


class Maths {
    int findOfExpression(int m) {
        int fact = 1;//here we assigned 1 to fact . later fact variable is used to store the result of  the factorial
        for (int i = 1; i <= m; i++) {
            fact = fact * i;// 1*1=1 1*2=2 2*3=6 6*4=24
        }
        return fact;
    }
}

package day7;

public class example1 {


    public static void main(String[] args) {
        // write a program to find difference between two numbers
        //input shall we int,float or double
        //user defined method name should be equation(method or functions) name should be overloaded
        int diff1 = 5;
        int diff2 = 4;
        int diff = Diff.equation(diff1, diff2);
        System.out.println(diff);

        float f1=4.4f;
        float f2 =5.5f;
        float difference = Diff.equation(f1,f2);
        System.out.println(difference);

        double d1= 33.55;
        double d2 =44.77;
        double different =Diff.equation(d1,d2);
        System.out.println(different);
    }
}


class Diff {
    static int equation(int num1, int num2) {
        int diff = num1 - num2;
        return diff;
    }
    static float equation (float f1,float f2){
        float difference = f1-f2;
        return difference;
    }
    static double equation (double d1,double d2){
        double different=d1-d2;
        return different;
    }
}
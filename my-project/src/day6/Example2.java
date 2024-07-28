package day6;

public class Example2 {

    public static void main(String[] args) {


        //Program to find largest of two number using user defined method
        int a = 9;
        int b = 11;
        Helper helper = new Helper();
        int largest = helper.largestOfTwoNumber(a, b);
        System.out.println(largest);
        int c = 6;
        int d = 8;
        int r = 9;
        int largests = helper.largestOfThreeNumbers(c, d, r);
        System.out.println(largests);
    }

}

class Helper {

    int largestOfTwoNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }


    }

    int largestOfThreeNumbers(int d, int c, int r) {
        if (c < d && r < d) {
            return d;
        } else if (d < c && r < c) {
            return c;
        } else {
            return r;
        }
    }


}
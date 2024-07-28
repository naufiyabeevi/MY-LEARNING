package day8;

public class Example3 {

    int age;// attribute
    int b;
    int c;
    int d;

    //Default constructor.  No need to provide this constructor because java will provide it by default.
    public Example3() {

    }

    //Constructor parameter
    public Example3(int aAge) { // aAge = 22
        age = aAge; // attribute initialized  age = aAge
    }


    //You can have as many parameters as you want:
    public Example3(int h, int i, int j) {
        b = h;
        c = i;
        d = j;
    }


    public static void main(String[] args) {
        //Example3 obj = new Example3(); // Called default constructor
        Example3 o = new Example3(22); // Parameterised constructor
        System.out.println(o.age); // 22

        Example3 ex = new Example3(7, 6, 5); // Parameterised constructor
        System.out.println(ex.b);
        System.out.println(ex.c);
        System.out.println(ex.d);
    }
}

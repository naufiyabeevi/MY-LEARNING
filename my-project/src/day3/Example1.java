package day3;

public class Example1 {
    public static void main(String[] args) {


        //Arithmetic operators

        //+ - Addition
        int num1 = 9;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println(sum);

        //- Subtraction
        int a = 9;
        int b = 7;
        int diff = a - b;
        System.out.println(diff);

        //*    Multiplication
        int i = 2;
        int j = 2;
        int mult = i * j;
        System.out.println(mult);

        // /   Division

        float f1 = 5;
        float f2 = 2;
        float div2 = f1 / f2;
        System.out.println(div2);

        int s = 7;
        int k = 4;
        int div = s / k;
        System.out.println(div);   // 7/4 = (1) (3)

        int g = 9;
        int q = 2;
        int div1 = g / q;
        System.out.println(div1); // 4

        //%    Modulus    Returns the division remainder
        int h = 7;
        int z = 4;
        int mod = h % z;
        System.out.println(mod);

        // Increment - Increases the value of a variable by 1
        int kk = 2;

        //Post Increment
        kk++;
        System.out.println(kk);

        //Pre Increment
        ++kk;
        System.out.println(kk);

        //Post Increment
        int x = 1;
        System.out.println(x++);
        System.out.println(x);

        //Pre Increment
        int n = 1;
        System.out.println(++n);


        //--   Decrement  Decreases the value of a variable by 1 --x
        int ss = 4;


        //Java Assignment Operators
        //Assignment operators are used to assign values to variables.
        int hh = 9;

        //The addition assignment operator (+=) adds a value to a variable:
        int qq = 2;
        qq = 5;
        System.out.println(qq);


        //Java Comparison Operators
        //==   Equal to
        int d = 2;
        int v = 2;
        System.out.println(d == v); // true
        System.out.println(d == 3); // false

        //!=   Not equal
        int a1 = 2;
        int a2 = 2;
        System.out.println(a1 != a2); // false

        //>    Greater than
        int aaa1 = 4;
        int aaa2 = 5;
        System.out.println(aaa1 > aaa2);//false

        //<    Less than
        int p1 = 4;
        int p2 = 5;
        System.out.println(p1 < p2);//true

        //>=   Greater than or equal to
        int h1 = 5;
        int h2 = 5;
        int h3 = 7;
        System.out.println(h1 >= h2); //true
        System.out.println(h3 >= h1); //true

        //<=   Less than or equal to
        int pp1 = 4;
        int pp2 = 4;
        int pp3 = 5;
        System.out.println(pp1<=pp2);//true
        System.out.println(pp3<=pp2);//false

        //Java Logical Operators
        //&&   Logical and    Returns true if both statements are true

        int vv1 = 6;
        int vv2 = 7;
        int vv3 = 5;
        System.out.println((vv1>vv2)&&(vv3<vv2)); // true && false = false

        //||   Logical or Returns true if one of the statements is true
        System.out.println((5>7)||(6>13)); // false

        // !   Logical not    Reverse the result, returns false if the result is true
        System.out.println(!(4>5)); // true

    }
}
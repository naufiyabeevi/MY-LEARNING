package day6;

public class Example1 {
    public static void main(String[] args) {
        //method is a block of code which only run when it is called
        //you can pass datas as parameters or arguments into a method
        // method are also known as functions
        //methods

        //predifined method
        String name = "julie";
        int lengthOfName = name.length();//here length is a predifined  method
        System.out.println(lengthOfName);

        //find largest of two number using Math class
        int a = 4;
        int b = 6;
        int max = Math.max(a, b);
        System.out.println(max);

        int num1 = 3;
        int num2 = 7;
        Calculator mathematic=new Calculator();
        int sum = mathematic.addition(num1,num2);
        System.out.println(sum);
        int num3 =8;
        int num4=4;
        int difference=mathematic.substraction(num3,num4);
        System.out.println(difference);
        int num5=7;
        int num6=3;
        int mult=mathematic.multiplication(num5,num6);
        System.out.println(mult);
        float num9 =9;
        float num10=2;
        float div =mathematic.division(num9,num10);
        System.out.println(div);


    }

}








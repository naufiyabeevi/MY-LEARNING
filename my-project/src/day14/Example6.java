package day14;

public class Example6 {
    public static void main(String[] args) {
        Animal obj=new Cat();
        System.out.println(obj.colour);
        //create a parent class animal with attribute colour and create a child class
        //cat .write a program to create a object of a cat class and using that object
        //call parent attribute colour
    }
}
class Animal{
    String colour="black";

    }

 class Cat extends Animal{

 }



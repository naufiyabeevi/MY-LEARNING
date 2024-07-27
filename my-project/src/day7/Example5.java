package day7;


public class Example5 {

    //Attribute
    int number = 9; //attribute

    public static void main(String[] args) {
        Example5 obj = new Example5(); // Object created
        System.out.println(obj.number); // printing attribute number


        //Modifying attributes
        obj.number = 44;
        System.out.println(obj.number);
    }
}

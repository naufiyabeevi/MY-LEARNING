package day2;

public class Example2 {
    public static void main(String[] args) {

        // Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> int -> long -> float -> double
        byte age = 17;
        double a = age;

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int ->  short -> byte
        
        int i = 9;
        short b = (short) i;//Compilation error
    }
}
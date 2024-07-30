package day10;

// Inheritence
public class Example3 {

    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.pi);//
        obj.areaOfCricle(2);

    }
}

// It is possible to inherit attributes and methods from one class to another
// Here day10.Mathematics to day10.Student
 class Mathematics{
    protected float pi = 3.14f;

    void areaOfCricle(int radius){
        float area = pi * radius;
        System.out.println(area);
    }
}

class Student extends Mathematics{ // Methods and sttributes inherited from day10.Mathematics

}


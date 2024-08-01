package day10;

public class practice3 {
    public static void main(String[] args) {
        Student object =new Student();
        System.out.println(object.length);
        object.methodsss(7);


    }

}
class mathematics{
    protected int length=2;
    void methodsss(int breadth){
int  area=breadth*length;
        System.out.println(area);
}}
class Student extends mathematics{

}
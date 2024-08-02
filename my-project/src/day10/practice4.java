package day10;/*abstraction*/

public class practice4 {
    public static void main(String[] args) {
        school audience =new church();
        audience.assembly(9089078);
        audience.prayer();

    }
}
abstract class school{
    public abstract void assembly(int number);
    public void prayer (){
        System.out.println("hi all");
    }

    }

class church extends school{
    public void assembly(int number){
        System.out.println("hii john");

    }
}

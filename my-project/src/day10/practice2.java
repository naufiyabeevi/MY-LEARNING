package day10;

public class practice2 {// polymorphism
    public static void main(String[] args) {
        world train =new world();
        train.methodzz();
        world bus =new Country();
        bus.methodzz();
        world cycle =new India();
        cycle.methodzz();
    }
}
class world{
    void methodzz(){System.out.println("train is a fast");}
    }
 class Country extends world{
    void methodzz(){System.out.println("bus is a slow");}
    }
class India extends world{
    void methodzz(){System.out.println("cycle is a small vehicle");}
    }




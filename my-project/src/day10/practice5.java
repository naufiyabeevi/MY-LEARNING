package day10;

public class practice5 {
    public static void main(String[] args) {
        animal objectz =new Birds();
        objectz.methodz(567);
        animal objectzz =new fish();
        objectzz.methodzz(978);
    }
}
interface  animal{
     void methodz (int id);
    void methodzz (int phno);
}
class Birds implements animal {
    public void methodz(int id) {System.out.println("ENTERING ID");}
     public   void methodzz (int phno){   }
    }

class fish implements animal{
    @Override

    public void methodzz(int phno) {System.out.println("entering ph no");}
    public void methodz (int id){}
        }

package day10;

public class practice1 {
    public static void main(String[] args) {
        Library objs = new Library();
        objs.mymethod();
        Library objss =new conferencehall();
         objss.mymethod();
         Library objse= new room();
         objse.mymethod();


    }}
    class Library{
        void mymethod(){System.out.println("library is a very big");}
    }
    class conferencehall extends Library{
        void mymethod(){System.out.println( "conference hall is big");}
    }
    class room extends Library {
        void mymethod() {
            System.out.println("room is small");
        }
    }



















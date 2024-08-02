package day10;

public class practice6 {
    enum games{CRICKET,FOOTBALL,HOCKEY,CHESS}

    public static void main(String[] args) {
        games see=games.HOCKEY;
        switch(see) {
            case CRICKET:
                System.out.println("cricket printing");
                break;
            case FOOTBALL:

                System.out.println("football printing");
                break;
            case HOCKEY:

                System.out.println("hockey printing");
                break;
            case CHESS:

                System.out.println("chess  printing");
                break;
        }}
    }




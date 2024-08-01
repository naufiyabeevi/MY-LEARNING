package day10;

public class Example6 {

    //You can also have an enum inside a class:
    enum Country {
        INDIA, USA, JAPAN
    }


    public static void main(String[] args) {

        //Enum in a Switch Statement
        Country d = Country.INDIA;
        switch (d) {
            case INDIA:
                System.out.println("India printing");
                break;
            case USA:
                System.out.println("USA printing");
                break;
            case JAPAN:
                System.out.println("Printing Japan");
                break;
        }

        System.out.println("\n");
        //Loop Through an Enum
        //Advance for loop
        Day[] values = Day.values();
        for (Day dd : values) {
            System.out.println(dd);
        }
    }

}


// tO REPERESENT CONSTANTS
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY;
}
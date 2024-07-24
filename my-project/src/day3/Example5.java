package day3;

public class Example5 {
    public static void main(String[] args) {
        //Java Switch

        int day = 3;

        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
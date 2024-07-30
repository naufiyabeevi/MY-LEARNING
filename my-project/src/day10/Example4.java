package day10;

// Abstraction
public class Example4 {
    public static void main(String[] args) {

        //User
        Notification not = new SMS();
        not.sendDefaultMessage();
        not.sendSms(99999999);
    }
}

// Abstract class: is a restricted class that cannot be
// used to create objects (to access it, it must be inherited from another class).
// 0 to 100 % abstraction
abstract class Notification {

    //Abstract method: can only be used in an abstract class, and it does not have a body.
    // The body is provided by the subclass (inherited from).
    public abstract void sendSms(int number); //

    // An abstract class can have both abstract and regular methods:
    public void sendDefaultMessage() { // regular method
        System.out.println("Sending default message");
    }
}

class SMS extends Notification { // Inheritence

    @Override
    public void sendSms(int number) {
        // 50 lines
        System.out.println("Sending sms...");
    }
}
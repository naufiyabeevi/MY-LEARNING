package day10;

//interface
public class Example5 {

    public static void main(String[] args) {
        MyNotification obj = new MyEmail();
        obj.sendEmail("sibin@gmail.com");

        MyNotification obj1 = new MySMS();
        obj1.sendSms(123455);
    }
}

//100 % abstraction can be achieved using interface
interface MyNotification {

    // Two abstract method
    void sendSms(int number); // no need to use public abstract

    void sendEmail(String emailId);
}

class MySMS implements MyNotification {

    @Override
    public void sendSms(int number) {
        System.out.println("Sending Sms");
    }

    @Override
    public void sendEmail(String emailId) {

    }
}

class MyEmail implements MyNotification {

    @Override
    public void sendSms(int number) {

    }

    @Override
    public void sendEmail(String emailId) {
        System.out.println("Sending email");
    }
}
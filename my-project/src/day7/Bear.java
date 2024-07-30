package day7;

public class Bear {

    // attributes
    int age = 9; //  attribute 1
    String color = "Black"; // attribute 2

    // methods
    void doSleeping() { // method 1 return type void. Just printing
        System.out.println("Bear sleeping");
    }

    void doRunning() { // method 2 return type void. Just printing
        System.out.println("Bear running");
    }

    int getAge() { // return type int
        return age; // returning age
    }

    public static void main(String[] args) {
        //To create an object of Bear,
        // specify the class name,
        // followed by the object name,
        // use the keyword new ,
        // followed by constructor name of Bear class:

        Bear bear = new Bear(); // created object of bear                  // heap memory bear
        System.out.println("Age of bear:" + bear.age);
        System.out.println("Color of bear:" + bear.color);
        bear.doRunning();
        bear.doSleeping();
        int age = bear.getAge();
        System.out.println(age);

        System.out.println("\n");

        Bear bear2 = new Bear();// another object created                   // heap memory bear2
        System.out.println("Age of bear:" + bear2.age);
        System.out.println("Color of bear:" + bear2.color);
        bear2.doRunning();
        bear2.doSleeping();
        System.out.println("\n");

        Bear bearrrrrr3 = new Bear();                                     // heap memory bear3
        System.out.println("Age of bear:" + bearrrrrr3.age);
        System.out.println("Color of bear:" + bearrrrrr3.color);
        bearrrrrr3.doRunning();
        bearrrrrr3.doSleeping();
    }
}

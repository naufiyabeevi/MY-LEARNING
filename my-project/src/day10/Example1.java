package day10;

//Polymorphism
//Feature that allows us to perform a single action in different ways.
public class Example1 { // Method Overriding example
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.running();

        Vehicle car = new Car();
        car.running();

        Vehicle bus = new Bus();
        bus.running();
    }
}

class Vehicle { // Generic class - Parent or Base or Super class

    void running() {
        System.out.println("day10.Vehicle running");
    }
}

  //  Method Overriding  – This is an example of runtime time (or dynamic polymorphism)
class Car extends Vehicle { // Child or sub or derived class . This is inheritence

    @Override
    void running() {
        System.out.println("day10.Car running");
    }
}

//Method Overriding – This is an example of runtime time (or dynamic polymorphism)
class Bus extends Vehicle { // Child or sub or derived class . This is inheritence
    @Override
    void running() {
        System.out.println("day10.Bus running");
    }
}
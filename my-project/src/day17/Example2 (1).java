package day17;

//Threads
class Example2 {
    public static void main(String[] args) {
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());

        MyClass myClass = new MyClass();
        myClass.start();

        MyAnotherClass myAnotherClass = new MyAnotherClass();
        Thread thread = new Thread(myAnotherClass);
        thread.start();
    }
}

//Created by extending the Thread class and overriding its run() method
class MyClass extends Thread {

    @Override
    public void run() {
        System.out.println("This code is running in a thread " + Thread.currentThread().getName());
    }

}

//Another way to create a thread is to implement the Runnable interface
class MyAnotherClass implements Runnable {

    @Override
    public void run() {
        System.out.println("This code is running in a thread " + Thread.currentThread().getName());
    }
}
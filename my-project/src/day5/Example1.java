package day5;

public class Example1 {
    public static void main(String[] args) {
        //write a java program to print even numbers between 1 and 20
        for (int u=1;u<=20;u++){
            if(u%2!=0){
                continue;
            }
            System.out.println(u);

        }
    }
}

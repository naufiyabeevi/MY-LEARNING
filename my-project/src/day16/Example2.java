package day16;

public class Example2 {
    public static void main(String[] args) {
        //write a program to print odd and even numbers from an array?
        int[] ints = {3, 4, 6, 7, 9, 2};
        System.out.println("Even numbers");

        for (int i = 0; i < ints.length; i++) {

            if (ints[i] % 2 == 0) {
                System.out.println(ints[i]);
            }
        }
        System.out.println("odd numbers");

            for(int j=0;j<ints.length;j++){
                if(ints[j]%2!=0){
                    System.out.println(ints[j]);
                }
            }

        }
    }



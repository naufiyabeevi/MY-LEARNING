package day5;

public class practice2 {
    public static void main(String[] args) {
        int number=13456;
        int reversed=0;//6
        while(number!=0) {
            int digit = number % 10;//6 5 4 3 1
            reversed = reversed * 10 + digit;// 6 65 654 6543 65431
            number=number/10;// 1345 134 13 1 0

        }
        System.out.println(reversed);





}}

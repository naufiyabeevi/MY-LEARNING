package day5;

public class Example2 {
    //WRITE A JAVA PROGRAM TO PRINT NUMBERS BETWEEN 1 AND 25 WHERE NUMBERS SHOULD BE DIVISIBLE BY 3
    public static void main(String[] args) {
        for (int h=1;h<=25;h++){
            if(h%3!=0){
                continue;
            }
            System.out.println(h);
        }
    }
}

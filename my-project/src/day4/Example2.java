package day4;

public class Example2 {
    public static void main(String[] args) {

        //Break
        // The break statement can also be used to jump out of a loop.
        for (int i = 0; i <= 10; i++) {
            if(i==4){
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");
        //Java Continue
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

         for(int i =1;i<=5;i++){
             if(i==3){
                 continue;
             }
             System.out.println(i);
         }

    }
}

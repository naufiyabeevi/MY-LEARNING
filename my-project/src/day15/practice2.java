package day15;

//date
import java.util.Date;

public class practice2 {
    public static void main(String[] args) {
        System.out.println(new Date());
        // count words
        String words="one two three four";
        int countwords =words.split("\\s").length;
        System.out.println(countwords);
        int[] array={6,7,8,9};
        int sum=0;
        int i;
        for( i=0;i<array.length;i++) {
            sum = sum * array[i];
        }
        System.out.println(sum);

    }
}

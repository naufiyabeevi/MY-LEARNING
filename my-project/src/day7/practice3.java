package day7;

public class practice3 {
    public static void main(String[] args) {


        int i1 = 1;
        int i2 = 21;
        Collect utility = new Collect();
        utility.FindOddNumber(i1, i2);
    }
}


class Collect {
    void FindOddNumber(int i1, int i2) {
        int i;
        for (i = i1; i <= i2; i++){
        if (i % 2 != 0) {
            System.out.println(i);

        }
    }

        }}







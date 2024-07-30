package day9;

public class Example5 {
    public static void main(String[] args) {
        int[] array = {5, 7, 88};
        System.out.println(array.length);
        System.out.println(array[0]);
        array[1] = 9;
        System.out.println(array[1]);
        //program of print to element of array
        for (int h = 0; h < array.length; h++) {
            System.out.println(array[h]);

        }
        // program to print sum of all numbers of array?
        int sum = 0;

        for (int m = 0; m < array.length; m++) {
            sum = sum + array[m];//0+5=5,5+9=12,12+88=102

        }
        System.out.println(sum);
    }

}


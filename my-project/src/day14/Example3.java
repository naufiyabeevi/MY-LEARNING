package day14;

//for practicing we are not concern about performance//
public class Example3 {
    public static void main(String[] args) {
        //write a program to sort numbers in ascending order using for loop?
        int[] array = {7, 8, 9, 1};//{1,8,9,7},{
        for (int i = 0; i < array.length; i++) {//i=0,i=1,
            for (int j = i + 1; j < array.length; j++) {//j=1,2,3,2,3,
                if (array[i] > array[j]) {//7>8,7>9,7>1,8>9,8>1,
                    int temp = array[i];//7,8,
                    array[i] = array[j];//1,1
                    array[j] = temp;//7,8,
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

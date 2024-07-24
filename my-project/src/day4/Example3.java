package day4;

public class Example3 {
    public static void main(String[] args) {

        //Arrays are used to store multiple values
        // in a single variable, instead of declaring separate variables for each value.
        //Array of String
        String[] students = {"Rahul", "Arun", "Afsal"};
        //0 -> Rahul
        //1->Arun
        //2 ->Afsal

        //Size of an array
        System.out.println(students.length);


        //Array of numbers
        int[] numbers = {2, 3, 4, 6, 7, 8, 9}; //

        //find first elemet
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);


        //Change an Array Element to 13
        numbers[0] = 13; //{13, 3, 4, 6, 7, 8, 9}

        //Lenght of numbers array
        System.out.println(numbers.length);


        //Loop Through an Array
        //You can loop through the array elements with the for loop,
        // and use the length property to specify how many times the loop should run.
        //int[] numbers = {2, 3, 4, 6, 7, 8, 9};
        //Print all elements of the array
        for (int i = 0; i < numbers.length; i++) { //7
            System.out.println(numbers[i]); // 2 3 4
        }


        String[] country = {"India", "USA", "Canada"};

        // 0 -> India
        // 1  > USA
        // 2 -> Canada

        for (int j = 0; j < country.length; j++) {
            System.out.println(country[j]);
        }
    }
}

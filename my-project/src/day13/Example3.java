package day13;

public class Example3 {
    public static void main(String[] args) {

        int[] ints = {8, 1, 4, 11};
        try {
            System.out.println(ints[9]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{ // The finally statement lets you execute code,
            // after try...catch, regardless of the result:
            System.out.println("Always executing");
        }

    }
}

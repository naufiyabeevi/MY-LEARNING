package day13;

public class practice1 {
    public static void main(String[] args) {
        int[]array={5,6,7,8};
        try {
            System.out.println(array[9]);
        }catch(Exception h) {
            System.out.println(h.getMessage());
        }finally{
            System.out.println("always executing");

        }
    }
}

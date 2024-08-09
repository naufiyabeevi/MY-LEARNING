package day15;

public class Example2 {
    public static void main(String[] args) {
        //java program to check whether two strings are equal?(ignore case)
        String n1 = "DOG";
        String n2 = "CAT";
        Bclass obj = new Bclass();
        Boolean check =obj.method(n1,n2);
        System.out.println(check);
    }
}

class Bclass {
    Boolean method(String n1, String n2) {
        if (n1.equalsIgnoreCase(n2)) {
            return true;
        } else {
            return false;
        }
    }}

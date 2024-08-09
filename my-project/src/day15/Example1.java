package day15;

public class Example1 {
    public static void main(String[] args) {
        //java program to check whether two strings are equal?
        String r1 = "earth";
        String r2 = "pluto";
        AClass obj =new AClass();
        Boolean status =obj.checkStringEquality(r1,r2);
        System.out.println(status);
        String s1="jupiter";
        String s2 ="jupiter";
        Boolean statuss =obj.checkStringEquality(s1,s2);
        System.out.println(statuss);
        String m1 ="Alpha";
        String m2="alpha";
        Boolean check =obj.checkStringEquality(m1,m2);
        System.out.println(check);

    }
}

class AClass {
    boolean checkStringEquality(String r1, String r2) {
        if (r1.equals(r2)) {
            return true;
        } else {
            return false;
        }//==is used to check memory adress(String)

    }
}
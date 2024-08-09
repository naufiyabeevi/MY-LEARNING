package day16;

public class Example1 {
    public static void main(String[] args) {
        //write a java program to check whether the given string is palindrome
        String str = "malayalam";
        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
        if (str1.equals(str)) {
            System.out.println("this string is palindrome");
        }else{
            System.out.println("this string is not palindrome");
        }

    }
}

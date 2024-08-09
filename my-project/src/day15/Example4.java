package day15;

public class Example4 {
    public static void main(String[] args) {
        //java program to reverse a string using for loop?
        String str = "pluto";
        //create a temparary string variable
        //loop through the string in reversed order
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {//5-1=4,4-1=3,3-1=2,2-1=1,1-1=0,
            str1 = str1 + str.charAt(i);//+o=0,o+t=ot,ot+u=otu,otu+l=otul,otul+p=otulp
        }
        System.out.println(str1);
    }
}

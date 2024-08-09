package day14;
//since for learning purpose i have not concerning about performance
public class practice1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int sum = a + b;//9
        int difference = a - b;//1
        int temp = sum + difference;//10
        int temps = sum - difference;//8
        b = temp / 2;
        a = temps / 2;

        System.out.println(a);
        System.out.println(b);
    }
}

package day7;public class Practice2 {
    public static void main(String[] args) {
        int a=4;
        int b=7;
         Group group=new Group();
         int sum = group.sub(a,b);
        System.out.println(sum);
    }
}

class Group{
    int sub (int d,int c){
       int  sum=d+c;
        return sum;


}}

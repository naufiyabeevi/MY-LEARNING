package day8;

import com.sun.jdi.PathSearchingVirtualMachine;

public class practice3 {
    int f;
    int h;
    String k;

public  practice3(int y,int m,String  d){
   f=y;
   h=m;
   k= d ;
}

    public static void main(String[] args) {
        practice3 hjk =new practice3(6,7,"red");
        System.out.println(hjk.f);
        System.out.println(hjk.h);
        System.out.println(hjk.k);
        }
    }



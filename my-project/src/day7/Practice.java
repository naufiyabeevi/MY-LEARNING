package day7;

public class Practice {
    //atributes
    int age = 6;
    String name = "tiger";
    String colour = "orange";

    // methods
    void DoRunning() {System.out.println("tiger is running");}
    int  GetAge (){return age;}


    public static void main(String[] args) {
        Practice Tiger = new Practice();
        System.out.println(Tiger.name);
        System.out.println(Tiger.colour);
        int age = Tiger.GetAge();
        System.out.println(age);

    }
}



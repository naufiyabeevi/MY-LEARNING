package day8;

// for class you can use public or default
//Access Modifiers
public class Example4 {

    //public	The code is accessible for all classes
    //private	The code is only accessible within the declared class
    //default	The code is only accessible in the same package.
    //protected	The code is accessible in the same package and subclasses

    // Attributes
    //Access Modifiers - controls the access level
    int age = 9; // default modifier
    public int b = 7; // public modifier
    private int c = 11; // private modifier
    protected int d = 17; // protected modifier


    //Methods
    public void aMethod() {
    } // public method (public modifier)

    void bMethod() {
    } // default method

    private void cMethod() {
    } // private method(private modifier)

    protected void dMethod() {
    } // protected method (protected modifier)


    // Constructors
    Example4() {
    } // default Constructor

    public Example4(int a) {
    } // public constructor

    private Example4(String str) {
    } // private constructor

    protected Example4(char c) {
    } // protected constructor

    public static void main(String[] args) {
        Example4 obj = new Example4();
        System.out.println(obj.c);
    }
}


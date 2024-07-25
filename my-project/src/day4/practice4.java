package day4;

public class practice4 {
    public static void main(String[] args) {
        //while loop
        int i = 5;
        while (i >= 0) {
            i--;
            System.out.println("hy");
        }

        System.out.println("\n");

        //do/while loop
        int u = 7;
        do {
            System.out.println(u);
            u--;
        } while (u >= 0);


        System.out.println("\n");
        //forloop

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
        }


        //break
        System.out.println("\n");
        for (int ba = 0; 0 < 10; ba++) {
            if (ba == 3) {
                break;
            }
            System.out.println(ba);
            System.out.println("\n");
            //continue
            for (int hg = 0; hg < 6; hg++) {
                if (hg == 4) {
                    continue;
                }
                System.out.println(hg);

                String[] colors = {"blue", "white","yellow", "black"};
                System.out.println(colors.length);

            }
        }
    }}




    //acess the element of an array
    //change the position of an array



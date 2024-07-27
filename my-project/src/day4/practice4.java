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
                colors[0]="white";
                System.out.println(colors.length);
                System.out.println(colors[3]);
                System.out.println(colors[0]);
                System.out.println("\n");
                int [][]num5= {{7,8,9,5,4},{7,9,3,2,1}};
                System.out.println(num5 [0][3]);
                System.out.println(num5[0][3]*num5[1][3]);




            }
        }
    }}




    //acess the element of an array
    //change the position of an array



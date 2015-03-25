package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 256 + 3180;
        int b = 90 +690;
	System.out.println("Sum of 256 and 3180: " + (256 + 3180));
        String h = " Our results:\n 10\n 20\n 358";

        System.out.print (h);
        boolean t = true;
        boolean g = false;

        t = 5 !=4;
        //g = !false;

        g = "abc" == "abc";
        System.out.print (h);
        System.out.println();

        int[] h1={10,0,0,21,-5,38};
        int e1 = h1[0];
        int e2 = h1[1];
        int e3 = h1[2];
        int e4 = h1[3];
        int e5 = h1[4];
        int e6 = h1[5];

        System.out.println(""+e1+""+e2+""+e3+""+e4+""+e5+""+e6);
        System.out.println(args[0]);

        String[] j2 = {"a", "b", "c"};
        String[] j3 = {"a", "b", "c"};

        //System.out.println(""+e1+""+e2+""+e3+""+e4+""+e5+""+e6);

        System.out.println(j2[0]+"-"+j3[0]+","+j2[1]+"-"+j3[1]+","+j2[2]+"-"+j3[2]);
        System.out.println();
        int f=20;
        if (f<15) {
            System.out.println("Усл Вып.");
        }
        else
        {
            System.out.println("Усл не Вып.");
        }
    }
}

package com.company;

/**
 * Created by Alex on 25.03.2015.
 */
public class Main2 {
    public static void main(String[] args) {
        //args[0] = "Hello";

        if (args[0].equals("Hello")) {
            System.out.println("Class");
        } else {
            System.out.println("Good bye");
        }
        if (args[0].equals("Hello")) {
            if (args[1].equals("Class")) {
                System.out.println("Success");
            } else {
                System.out.println("Good bye");
            }
        } else {
            System.out.println("Good bye");
        }
        int a = 10;

        while (a < 15) {
            System.out.println("a is:" + a);
            a = a + 1;
        }
        System.out.println("While is over!");

        while (true){
            if (a>15){
                break;
            }
            a=a+1;
        }
        System.out.println("While is over2!");
        int i = 0;
        while (i <5) {
            i = 10;
            System.out.println(i);
        }
        System.out.println(i);
        String s = "s";
           for (int j =0; j < 5; j = j + 1) {
                System.out.println(j);
               if (s.equals("error")) {
                   break;}

                   System.out.println(j);
        }

    }
}


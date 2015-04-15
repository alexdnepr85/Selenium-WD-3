package com.company;

/**
 * Created by Alex on 06.04.2015.
 */
public class Easy {
    public static void main(String[] args) {
        compare(sum(10, 20), 30);
        compare(sum(-10, 100), 90);
        compare(sum(0, 9999), 9999);
    }
    public static void compare(int o, int p) {
        if (0== p) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
    public static int sum(int k, int u) {
        int res = k + u;
        return res;
    }
}

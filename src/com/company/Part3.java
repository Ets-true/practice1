package com.company;

public class Part3 {

    public static double harmonic(int n) {
        return 1 / (double) n;
    }

    public static void main(String[] args) {
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %.3f", harmonic(i + 1));
        }
        System.out.println(" ]");
    }
}

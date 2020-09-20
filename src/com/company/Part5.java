package com.company;

public class Part5 {
    public static void fact(int s) {
        int factorial = 1;
        for (int i = 1; i <= s; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        fact(10);
    }
}

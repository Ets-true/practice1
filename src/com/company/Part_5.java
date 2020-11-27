package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Part_5 {

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int ch = myobj.nextInt();

        int fact = 1;
        for (int i = 1; i <= ch; i++) {
            fact *= i;
        }
        System.out.println(fact);
        myobj.close();
    }
}

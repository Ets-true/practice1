package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Part_3 {

    public static double harmonic(int n) {
        return 1 / (double) n;
    }

    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            System.out.println(String.format("%.3f", (1.0/i) ));
        }
    }
}

package com.company;

import java.util.Random;

public class Part4 {
    public static void Rand1(int[] n) {
        Random random = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(100);
        }
    }

    public static void Rand2(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 100);
        }
    }

    public static void main(String[] args) {
        int[] mass = new int[10];
        Rand1(mass);
        Rand2(mass);

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                int m;
                if (mass[i] > mass[j]) {
                    m = mass[i];
                    mass[i] = mass[j];
                    mass[j] = m;
                }
            }
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }

    }
}


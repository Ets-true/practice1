package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Part_4 {


    public static void main(String[] args) {
        Random ran_gen = new Random();

        int arr_size = ran_gen.nextInt(21) + 5;
        int[] rand_arr = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            rand_arr[i] = 1 + (int)(Math.random() * 100);
        }

        System.out.print("\nArray: ");

        for (int element : rand_arr) {
            System.out.print(element + " ");
        }

        Arrays.sort(rand_arr);

        System.out.print("\nSorted array: ");

        for (int element : rand_arr) {
            System.out.print(element + " ");
        }

    }
}


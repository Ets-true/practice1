package com.company;

public class Part1 {

    public static int forCycle(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int whileCycle(int[] arr) {
        int result = 0;
        int i = 0;
        while (i < arr.length) {
            result += arr[i];
            i++;
        }
        return result;
    }

    public static int dowhileCycle(int[] arr) {
        int result = 0;
        int i = 0;
        do {
            result += arr[i];
            i++;
        } while (i < arr.length);
        return result;
    }


    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[]{5, 4, 3};
        System.out.println("Sum=" + forCycle(arr));
        System.out.println("Sum=" + whileCycle(arr));
        System.out.println("Sum=" + dowhileCycle(arr));
    }

}

package com.company;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Part_1 {


    public static void main(String[] args) {
        int array[] = {6, 8, 9, 3};
        int result = 0;

        //Сумма циклом for (пункт 3)
        for(int i=0;i<array.length;i++)
            result+=array[i];
        System.out.println(result);

        //Сумма циклом while (пункт 3)

        int i=0;
        while(i!=4) {
            result += array[i];
            i++;
        }
        System.out.println(result);


        //Сумма циклом do while (пункт 3)
        int i = 0;
        do{
            result+=array[i];
            i++;
        }while(i!=4);
        System.out.println(result);

    }

}

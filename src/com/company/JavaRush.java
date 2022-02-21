package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 3 лекция Revers
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N;
        int [] array;

        System.out.println("Введите число элементов");
        N = console.nextInt();
        array = new int[N];

        System.out.println("Введите " + N + " чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        if (N % 2 == 0) {
            for (int i = array.length-1; i >= 0; i--)
                System.out.println(array[i]);
        } else
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
    }

}
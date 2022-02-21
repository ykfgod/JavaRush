package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 3 лекция Максимальное из N чисел
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

        N = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++)
            if (array[i] > N)
                N = array [i];

        System.out.println(N);

    }

}
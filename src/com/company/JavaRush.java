package com.company;

import java.util.Scanner;

/*
    JavaRush 6 уровень,  1 лекция Выполнение фрагмента кода
 */
public class JavaRush {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0)
                array[i] = array[i] * -1;

        System.out.println(array[i]);
        }
    }
}
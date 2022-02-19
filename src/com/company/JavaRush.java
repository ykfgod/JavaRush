package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  5 лекция Второе минимальное число из введенных
 */
public class JavaRush {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int i = 0;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            i = console.nextInt();

            if (i < min) {
                min2 = min;
                min = i;
            }

            if ((i < min2) && (min != i))
                min2 = i;
        }

        System.out.println(min);
        System.out.println(min2);

    }
}
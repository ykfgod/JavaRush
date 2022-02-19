package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  5 лекция Минимум из введенных чисел
 */
public class JavaRush {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int i = 0;
        int min = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            i = console.nextInt();
            if (i < min)
                min = i;
        }

        System.out.println(min);
    }
}
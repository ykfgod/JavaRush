package com.company;

import java.util.Scanner;

/*
    JavaRush 4.3 Суммирование
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int count;

        count = console.nextInt();

        while (console.hasNextInt()) {
            count += console.nextInt();
        }

        System.out.println(count);
    }
}
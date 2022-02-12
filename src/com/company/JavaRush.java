package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        // Большее число

        Scanner console = new Scanner(System.in);
        int x, y, z;

        System.out.println("Введите 1 число");
        x = console.nextInt();

        System.out.println("Введите 2 число");
        y = console.nextInt();

        z = x > y ? x : y;

        System.out.println("Большее число");
        System.out.println(z);
    }
}

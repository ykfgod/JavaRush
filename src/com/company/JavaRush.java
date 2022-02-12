package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        // Можно не работать

        Scanner console = new Scanner(System.in);
        int a;

        System.out.println("Введите свой возраст");
        a = console.nextInt();

        if ((a < 20) || (a > 60))
            System.out.println("Можно не работать");
        else
            System.out.println("Опять работа ? 0-0");
    }
}

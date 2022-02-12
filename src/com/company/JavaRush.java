package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        int a, b, c;
        boolean isHigh = false, isLow = false;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите 1 число");
        a = console.nextInt();

        System.out.println("Введите 2число");
        b = console.nextInt();

        System.out.println("Введите 3число");
        c = console.nextInt();

        if (a == b) {
            if (a == c)
            System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " "  + b);
        }
        else if (b == c)
            System.out.println(b + " " + c);
        else if (a == c)
            System.out.println(a + " " + c);
        else
            System.out.println("Нет равных чисел");
    }
}

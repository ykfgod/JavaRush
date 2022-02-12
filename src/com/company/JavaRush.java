package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        // Треугольник

        Scanner console = new Scanner(System.in);
        int a, b, c;

        System.out.println("Введите первую сторону треугольника");
        a = console.nextInt();

        System.out.println("Введите вторую сторону треугольника");
        b = console.nextInt();

        System.out.println("Введите третью сторону треугольника");
        c = console.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a))
            System.out.println("Можно составить треугольник");
        else
            System.out.println("Нельзя составить треугольник");
    }
}

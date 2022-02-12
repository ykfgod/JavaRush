package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        // Координатная четверть точки

        Scanner console = new Scanner(System.in);
        int x, y;

        System.out.println("Введите x");
        x = console.nextInt();

        System.out.println("Введите y");
        y = console.nextInt();

        if ((x < 0) && (y > 0))
            System.out.println("Первая четверть");
        else if ((x > 0) && (y > 0))
            System.out.println("Вторая четверть");
        else if ((x < 0) && (y < 0))
            System.out.println("Третья четверть");
        else
            System.out.println("Четвертая четверть");
    }
}

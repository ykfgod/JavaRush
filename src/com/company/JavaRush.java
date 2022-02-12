package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main(String[] args) {

        // Большее число

        Scanner console = new Scanner(System.in);
        double x, y;
        boolean z;

        System.out.println("Введите 1 число");
        x = console.nextDouble();

        System.out.println("Введите 2 число");
        y = console.nextDouble();

        z = Math.abs(y - x) < 0.0000001;

        if (z)
            System.out.println("Числа равны  с точностью до одной миллионной.");
        else
            System.out.println("Числа не равны");

    }
}
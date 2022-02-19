package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main(String[] args) {

        // 3.9 Сравним строки

        Scanner console = new Scanner(System.in);
        String a, b;

        System.out.println("Введите 1 строку");
        a = console.nextLine();

        System.out.println("Введите 2 строку");
        b = console.nextLine();


        if (a.equals(b))
            System.out.println("Одинаковые строки.");
        else
            System.out.println("Разные строки");

    }
}
package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        String a,b,c;
        int a1, b2, c3;
        Scanner console = new Scanner(System.in);
        a = console.nextLine();
        b = console.nextLine();
        c = console.nextLine();

        a1 = console.nextInt();
        b2 = console.nextInt();
        c3= console.nextInt();

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(c);
        System.out.println((a1 + b2 + c3) / 3);

    }
}

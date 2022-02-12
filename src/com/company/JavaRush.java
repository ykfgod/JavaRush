package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
КЛАСС ДЛЯ РАБОТЫ С КУРСОМ JAVARUSH
 */
public class JavaRush {
    public static void main (String [] args) {

        float a;
        boolean isHigh = false, isLow = false;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите возраст");
        a = console.nextFloat();

        if (a > 36.6f) {
            isHigh = true;
            System.out.println(isHigh);
        }
        else if (a < 36.6f) {
            isLow = true;
            System.out.println(isLow);
        }
        else
            System.out.println("Нормальная температура");
    }
}

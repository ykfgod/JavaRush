package com.company;

import java.util.Scanner;

/*
    JavaRush 6 уровень,  1 лекция Выполнение фрагмента кода
 */
public class JavaRush {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[20];

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0)
                strings[i] = EVEN;
            else
                strings[i] = ODD;
            System.out.println(strings[i]);
        }
    }
}
package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  10 лекция Стакан наполовину пуст или наполовину полон?
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        boolean a = console.nextBoolean();
        double glass = 0.5;

        if (a)
            System.out.println((int)Math.ceil(glass));
        else
            System.out.println((int)Math.floor(glass));
    }
}
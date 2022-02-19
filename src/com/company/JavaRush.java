package com.company;

import java.util.Scanner;

/*
    JavaRush 3.9 Сломанная клавиатура
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String a;
        String secret = "AmIGo";

        System.out.println("Введите пароль");
        a = console.nextLine();

        if (a.equalsIgnoreCase(secret))
            System.out.println("Доступ разрешен");
        else System.out.println("Доступ запрещен");
    }
}
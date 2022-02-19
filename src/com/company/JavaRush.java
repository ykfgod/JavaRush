package com.company;

import java.util.Scanner;

/*
    JavaRush 4.3 Все любят Мамбу
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = 0;
        String name;

        name = console.nextLine();

        while (n < 10) {
            System.out.println(name + " любит меня");
            n++;
        }
    }
}
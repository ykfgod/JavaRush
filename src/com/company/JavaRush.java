package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  9 лекция Хорошего не бывает много
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();

        System.out.println((int)(3.14*radius*radius));
    }
}
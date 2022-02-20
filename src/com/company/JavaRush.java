package com.company;

import java.util.Scanner;

/*
    JavaRush 5 уровень,  8 лекция Переобуваемся на лету
 */
public class JavaRush {
    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
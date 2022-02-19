package com.company;

import java.util.Scanner;

/*
    JavaRush 4.3 Незаполненный прямоугольник
 */
public class JavaRush {

    public static void main(String[] args) {
        int n = 0;

        while (n < 10) {

            int m = 0 ;

            if (n == 0 || n == 9) {
                while (m < 20) {
                    System.out.print('Б');
                    m++;
                }
            } else {
                System.out.print("Б");
                while (m < 18) {
                    System.out.print(' ');
                    m++;
                }
                System.out.print("Б");
            }

            n++;
            System.out.println();
        }
    }
}
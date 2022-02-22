package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 6 лекция Треугольный массив
 */
public class JavaRush {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            result[i] = new int [i+1];

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result[i][j] = i+j;
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
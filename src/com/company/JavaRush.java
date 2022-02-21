package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 5 лекция Таблица умножения
 */
public class JavaRush {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {

       MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                MULTIPLICATION_TABLE[i][j] = i*j;
                System.out.print(MULTIPLICATION_TABLE[i][j]+ " ");

            }
            System.out.println();
        }

    }
}
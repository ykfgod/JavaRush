package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 2 лекция Объединяем массивы
 */
public class JavaRush {

    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {

        resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        int j = 0;

        for (int i = firstArray.length; i < resultArray.length; i++) {

            resultArray[i] = secondArray[j];
            j++;
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }

    }

}
package com.company;

import java.util.Scanner;

/*
    JavaRush  6 уровень, 4 лекция Удаляем одинаковые строки
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String [] array = new String[6];

        System.out.println("Введите " + 6 + " строк");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextLine();
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) continue;

            for (int j = i+1; j < array.length ; j++) {

                if (array[i].equals(array[j]))
                {
                    array[i] = null;
                    array[j] = null;
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  4 лекция Сумма чисел, не кратных 3
 */
public class JavaRush {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 0;
        int sum = 0;

        while (i < 100) {
            i++;
            if ((i % 3) == 0)
             continue;
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}
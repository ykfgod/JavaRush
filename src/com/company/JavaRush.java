package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  6 лекция Сумма кратных чисел
 */
public class JavaRush {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start, end, multiple;
        int count = 0;

        System.out.println("Введите начальное число");
        start = console.nextInt();
        System.out.println("Введите последнее число");
        end = console.nextInt();
        System.out.println("Введите кратное число");
        multiple = console.nextInt();


        for (;start < end;) {
            if (start % multiple == 0) {
                System.out.println(start);
                count += start;
            }

            start++;
            continue;
        }
        System.out.println(count);
    }
}
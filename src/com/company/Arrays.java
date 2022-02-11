package com.company;
import java.util.Scanner;

// 9 Урок по Массивам Гоша Дударь
public class Arrays {
    public static void main(String[] args) {
        int[] first = new int[]{23, 34, 56};

        // Присваивание значение элементу массива
        // first[0] = 23; - начало индексации с 0

        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);

        int[] a;
        int n;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        n = in.nextInt();
        a = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент номер " + i +" ");
            a[i] = in.nextInt();
            sum += a[i];
        }

        System.out.println("Сумма ваших чисел = " + sum);
    }
}

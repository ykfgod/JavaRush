package com.company;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        // 8 Урок Гоша Дударь работа с циклами
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число ");
        int first = num.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(first++);
        }

        boolean isTrue = true;
        while (isTrue) {
            if ( first >= 350)
                isTrue = false;
            System.out.println(first++);
            break;
        }

        do {
            System.out.println(first--);
        } while (first > 200);

        while (first > 0) {
            first /= 2;
            if (first % 2 == 0)
                continue;
            System.out.println(first);
        }
    }
}

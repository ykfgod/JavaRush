package com.company;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        //6 Урок Гоша Математические операции
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.println("Введите первое число: ");
        first = num.nextFloat();
        System.out.println("Введите второе число: ");
        second = num.nextFloat();

        // Есть возможность присвоить значение переменной такое
        // result *= 2; - число умножается на 2
        // Или result--; Число уменьшается на 2

        System.out.println("Сложение = " + (first + second));
        System.out.println("Вычитание = " + (first - second));
        System.out.println("Умножение = " + (first * second));
        System.out.println("Деление = " + (first / second));
        System.out.println("Остаток от деления = " + (first % second));

    }
}
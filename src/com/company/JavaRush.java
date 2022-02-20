package com.company;

import java.util.Scanner;

/*
    JavaRush 4 уровень,  8 лекция Хорошего не бывает много
 */
public class JavaRush {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String s;
        int number;

        s = console.nextLine();
        number = console.nextInt();

        do {
            System.out.println(s);
            number--;
        }
        while ((number > 0) && (number < 4));

    }
}
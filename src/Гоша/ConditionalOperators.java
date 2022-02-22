package Гоша;
import java.util.Scanner;

public class ConditionalOperators {
    //Урок 7 Условные операции
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second =50;
        System.out.println("Введите число");
        first = num.nextInt();

        // || - это операнд или, &&  - это операнд и,

        if (first == 10) {
            System.out.println("Ваше число 10");
            System.out.println("\n");
        } else if (first < 10) {
            System.out.println("Ваше число меньше 10");
        }
        else {
            System.out.println("Ваше число больше 10");
        }

        switch (first) {
            case 10:
                System.out.println("Ваше число равно 10");
                break;
            case 0:
                System.out.println("Ваше число равно 0");
                break;
            default:
                System.out.println("Ваше число равно не 10 и не 0");
        }
    }
}

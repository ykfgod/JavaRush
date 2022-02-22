package Гоша;
import java.util.Scanner;
// 11 Урок Гоша Дударь Функции

public class Functions {
    public static void main(String[] args) {
        int temp = func(3,4);
        System.out.println("Введите массив ");
        readArray();
        System.out.println(temp);
    }

    public static int func (int a, int b) {
         int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return  result;
    }

    public static int [] readArray () {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i]  = in.nextInt();

        return arr;

    }
}

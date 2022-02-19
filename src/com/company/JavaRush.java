package com.company;

/*
    JavaRush 3.9 Сравнение строк по ссылке
 */
public class JavaRush {
    private static String string1 = "Амиго";
    private static String string2 = string1;
    private static String string3 = new String(string1);

    public static void main(String[] args) {
        //напишите тут ваш код
        //  System.out.println("ссылки на строки одинаковые");
        //напишите тут ваш код
        //  System.out.println("ссылки на строки разные");

        if(string1 == string2){
            System.out.println("ссылки на строки одинаковые");}
        else
            System.out.println("ссылки на строки разные");
        if(string2 == string3){
            System.out.println("ссылки на строки одинаковые");}
        else
            System.out.println("ссылки на строки разные");
        if(string1 == string3){
            System.out.println("ссылки на строки одинаковые");}
        else
            System.out.println("ссылки на строки разные");
    }
}
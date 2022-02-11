package com.company;
// 13 Урок Гоша Дударь Сохдание классов и объекта
// Этот клас открывается в классе 2 урока Main
public class Person {
    public int height = 180;
    public  String name = "Ваше имя";

    public void say (String name) {
        System.out.println("hello, " + name);
    }

    // 14 урок продолжение тут же Конструкторы
    public Person () {}

    public Person (String n) {
        name = n;
    }

    public Person (int h,String n) {
        height = h;
        name = n;
    }
}

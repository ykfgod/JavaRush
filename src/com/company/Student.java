package com.company;
//15 Урок Гоша Дударь Наследование главный класс Main
public class Student extends Person{
    int course = 1;
    void tell (){
        System.out.println(super.name);
        System.out.println(super.height);
        System.out.println(course);
    }

    public Student(int h,String n, int course){
        super(h, n);
        this.course = course;
    }
}

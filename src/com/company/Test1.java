package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Yarik", "Shangin", 12000);
        Employee emp2 = new Employee(67, "Anna", "Shangina", 90000);
        Employee emp3 = new Employee(15, "Anton", "Deruwa", 3500);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Befor \n" + list);
        Collections.sort(list);
        System.out.println("After \n" + list);
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
            if (this.id == o.id)
                return 0;
            else if (this.id < o.id )
                return  -1;
            else
                return 1;
    }
}



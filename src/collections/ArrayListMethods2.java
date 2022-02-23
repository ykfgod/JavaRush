package collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student std1 = new Student("Ivan", 'm', 22, 3,8.3);
        Student std2 = new Student("Yarik", 'm', 24, 4,7.2);
        Student std3 = new Student("Anna", 'f', 21, 2,5.4);
        Student std4 = new Student("Elena", 'f', 27, 4,9.0);
        Student std5 = new Student("Vasily", 'm', 23, 1,6.9);

        ArrayList<Student> list = new ArrayList<>();

        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        list.add(std5);

        System.out.println(list);

        Student std6 = new Student("Vasily", 'm', 23, 1,6.9);
        //list.remove(std6);
        System.out.println(list);

        int index = list.indexOf(std5);
        System.out.println(index);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }
}

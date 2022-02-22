package Гоша;
import java.lang.String;
public class Main{

    public static void main(String[] args) {
	// Первые 2 урока об установке, Hello World 3 урок и знакомсто с типами переменных.
        System.out.println("Hello to Java");
        System.out.println("Hello to Java");
        byte num = 100;
        int num2 = 1000000000;
        float num3 = 25.25f;
        char sym = 'Y';
        boolean isTrue = false;
        String str = "Я начал";
        System.out.println(str);

        // 13 Урок класс  и объекты

        Person yarik = new Person();
        yarik.height = 120;
        System.out.println(yarik.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

        yarik.say("vlad");

        // 14 Урок конструкторы
        Person dima = new Person("Dima");
        System.out.println(dima.name);

        Person vova = new Person(169, "Вова");
        System.out.println(vova.name +" ростом "+ vova.height);

        Person alesha = new Person ();
        System.out.println(alesha.name +" "+ alesha.height);

        //15 Урок Гоша Дударь Наследование главный класс Main
        Student student = new Student(180,"Anton", 3);
        student.tell();

        //16 Урок полиморфизм, наследуемые класс Triangle, Square, Circle от общего Shape
        
        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }

        // 17 Урок класс Computer

        Computer comp = new Computer();
        comp.i7.start();
        comp.transfer.start();

        new Computer() {
            void superComp () {
                this.i7.start();
                this.transfer.start();
            }
        };
    }
}

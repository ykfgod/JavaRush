package Гоша;
// 17 Урок вложенные и анонимные классы
public class Computer {
    class  Proccessor {
        private boolean isStart = false;

        public  void start () {
            isStart = true;
            System.out.println("Процессор запущен");
        }

        public  void shutdown () {
            isStart = false;
            System.out.println("Процессор выключен");

        }
    }

    class  RAM {
        private boolean isStart = false;

        public  void start () {
            isStart = true;
            System.out.println("Память ключена");
        }

        public  void shutdown () {
            isStart = false;
            System.out.println("Память выключена");
        }
    }

    Proccessor i7 = new Proccessor();
    RAM transfer = new RAM();

}

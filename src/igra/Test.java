package igra;

public class Test {
    public static void main(String[] args) {
        Schoolar sch1 = new Schoolar("Yarik", 14);
        Schoolar sch2 = new Schoolar("Anton", 15);
        Schoolar sch3 = new Schoolar("Olya", 14);
        Schoolar sch4 = new Schoolar("Serjey", 12);

        Student std1 = new Student("Valera", 19);
        Student std2 = new Student("Katya", 18);

        Employee emp1 = new Employee("Jenya", 34);
        Employee emp2 = new Employee("Max", 31);

        Team<Schoolar> schoolarTeam = new Team<> ("Drakoni");
        schoolarTeam.addNewParticipant(sch1);
        schoolarTeam.addNewParticipant(sch2);

        Team<Student> studentTeam = new Team<> ("Vperde");
        studentTeam.addNewParticipant(std1);
        studentTeam.addNewParticipant(std2);

        Team<Employee> employeeTeam = new Team<> ("Rabotyagi");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);
       // schoolarTeam.addNewParticipant(emp1);
       // schoolarTeam.addNewParticipant(std1);

        Team<Schoolar> schoolarTeam2 = new Team<> ("Knights");
        schoolarTeam.addNewParticipant(sch3);
        schoolarTeam.addNewParticipant(sch4);

        schoolarTeam.playWith(schoolarTeam2);

        //проблема в методе playWith школьники
        // не могут играть с работнипками или студентами
        //schoolarTeam.playWith(employeeTeam);
    }
}

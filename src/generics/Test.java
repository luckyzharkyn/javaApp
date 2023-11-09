package generics;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Temirkhan", 12);
        Schoolar schoolar4 = new Schoolar("Daulet", 16);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zharkyn", 32);
        Employee employee2 = new Employee("Baxa", 47);

        Team<Schoolar> schoolarTeam = new Team("Drakoni");
        Team<Schoolar> schoolarTeam2 = new Team("Mudresi");
        Team<Student> studentTeam = new Team("Vpered");
        Team<Employee> employeeTeamTeam = new Team("Rabotagi");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeamTeam.addNewParticipant(employee1);
        employeeTeamTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

    }
}

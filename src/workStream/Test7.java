package workStream;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("maria", 'f', 21, 2, 7.8);
        Student st3 = new Student("John", 'm', 23, 4, 9.1);
        Student st4 = new Student("anna", 'f', 20, 1, 7.5);
        Student st5 = new Student("Alex", 'm', 22, 3, 8.7);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathmatics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(Helper::show);;
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        this.studentsOnFaculty.add(student);
    }
}
package workStream;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("maria", 'f', 21, 2, 7.8);
        Student st3 = new Student("John", 'm', 23, 4, 9.1);
        Student st4 = new Student("anna", 'f', 20, 1, 7.5);
        Student st5 = new Student("Alex", 'm', 22, 3, 8.7);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream()
                .map(student -> {
                    StringBuilder s = new StringBuilder();
                     student.setName(s.append(student.getName().substring(0, 1).toUpperCase()).append(student.getName().substring(1)).toString());
                     return student;
                })
                .filter(student -> {
                    return student.getSex() == 'f';
                })
                .sorted((x, y) -> {
                    return x.getAge() - y.getAge();
                })
                .collect(Collectors.toList());
        Helper.show(students.toString());

//        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        Helper.show(students);

//        students = students.stream()
//                .filter(x-> x.getAge() > 22 && x.getAvgGrade()<7.2)
//                .collect(Collectors.toList());
//
//
//        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(Helper::show);

//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//        myStream.filter(x -> x.getAge() > 20).forEach(Helper::show);


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
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
}

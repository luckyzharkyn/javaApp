package workStream;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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


//        List<Integer> courses = students.stream()
//                .mapToInt(x -> x.getCourse())
//                .boxed()
//                .peek(Helper::show)
//                .sorted()
//                .collect(Collectors.toList());
//
//        Helper.show(courses);

        int sum = students.stream()
                .mapToInt(el -> el.getCourse())
                .sum();
        Helper.show(sum);

        double average = students.stream()
                .mapToInt(el -> el.getCourse())
                .average()
                .getAsDouble();
        Helper.show(average);

        int min = students.stream()
                .mapToInt(el -> el.getCourse())
                .min()
                .getAsInt();
        Helper.show(min);

        int max = students.stream()
                .mapToInt(el -> el.getCourse())
                .max()
                .getAsInt();
        Helper.show(max);


//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        Helper.show(min);
//
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        Helper.show(max);

//        students.stream().filter(x -> x.getAge() > 20).limit(2).forEach(Helper::show);
//        students.stream().filter(x -> x.getAge() > 20).skip(3).forEach(Helper::show);
    }
}

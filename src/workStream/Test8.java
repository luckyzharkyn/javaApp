package workStream;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//        Map<Integer, List<Student>> map = students.stream()
//                .map(x -> {
//                    x.setName(x.getName().toUpperCase());
//                    return x;
//                })
//                .collect(Collectors.groupingBy(x -> x.getCourse()));
//
//        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            Helper.show(entry.getKey() + ": " + entry.getValue().toString());
//        }

//        Map<Boolean, List<Student>> map =
//                students.stream()
////                .map(x -> {
////                    x.setName(x.getName().toUpperCase());
////                    return x;
////                })
//                .collect(Collectors.partitioningBy(x -> x.getAvgGrade() > 8));
//
//        for(Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
//            Helper.show(entry.getKey() + ": " + entry.getValue().toString());
//        }

        Student firstStudent = students.stream()
                .sorted((x, y) -> x.getAge() - y.getAge())
                .peek(Helper::show)
                .findFirst().get();
        Helper.show(firstStudent);
    }
}

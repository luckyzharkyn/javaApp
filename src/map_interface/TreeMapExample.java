package map_interface;

import codeMu.Helper;
import generics.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", 23);
        Student st2 = new Student("Zharkyn", 26);
        Student st3 = new Student("Zhuldyz", 24);
        Student st4 = new Student("Zhadyra", 24);
        Student st5 = new Student("Temirkhan", 22);
        treeMap.put(7.2, st3);
        treeMap.put(7.0, st5);
        treeMap.put(5.8, st1);
        treeMap.put(7.5, st4);
        treeMap.put(6.4, st2);
        Helper.show(treeMap.tailMap(6.4));
        Helper.show(treeMap.headMap(6.4));
        Helper.show(treeMap.lastEntry());
        Helper.show(treeMap.firstEntry());
//        treeMap.remove(7.2);
//        Helper.show(treeMap.descendingMap());
    }
}

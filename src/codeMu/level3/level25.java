package codeMu.level3;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class level25 {
    public static void main(String[] args) {
    //    №1 Дан текст со словами. Запишите в массив все слова, начинающиеся на букву "a".
//          String s = "Hello world my adam and Zharkyn. Nice to meet you aleks";
//          String[] arrays = s.split(" ");
//          ArrayList<String> arrays1 = new ArrayList<>();
//          for(String elem : arrays) {
//              if(elem.startsWith("a")) {
//                  arrays1.add(elem);
//              }
//          }
//         Helper.show(arrays1.toString());
    //    №2 Дан массив со числами. Проверьте, что все элементы этого массива являются положительными числами.
//          int[] figures = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5};
//          for(int elem : figures) {
//              if(elem < 0) {
//                  Helper.show(elem + " less than zero");
//              }
//          }
    //    №3 Дана некоторая строка:
//        String s = "1203405";
//    //    Найдите позицию последнего нуля в строке.
//          int lastOfIndex = s.lastIndexOf('0');
//          Helper.show(lastOfIndex);

    //    №4 Даны два массива:
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {4, 5, 6, 7, 8};
//    //    Выведите в консоль общие элементы этих массивов:
//    //    4
//    //    5
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        for(int i : arr1) {
//            set1.add(i);
//        }
//        for(int i : arr2) {
//            set2.add(i);
//        }
//        set1.retainAll(set2);
//        Helper.show(set1.toString());


    //    №5 Дана строка:
        String str = "abc def jhi";
    //    Подсчитайте количество слов в этой строке.
        Helper.show(str.split(" ").length);
    }
}

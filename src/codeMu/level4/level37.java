package codeMu.level4;

import codeMu.Helper;

import java.util.Arrays;
import java.util.stream.Stream;

public class level37 {
    public static void main(String[] args) {
    //    №1 Дан массив с целыми числами:
//        int[] arr = {123, 456, 789};
    //    Проверьте, что в нем есть число, содержащее в себе цифру 3.
//        Arrays.stream(arr)
//                .filter(x -> String.valueOf(x).contains("3"))
//                .forEach(Helper::show);
    //    №2 Дан массив со строками, содержащими целые числа в виде строк:
//        String[] arr = {"1", "2", "3", "4", "5"};
    //    Найдите сумму элементов этого массива.
//        String result = Arrays.stream(arr)
//                .reduce((acc, elem) -> {
//                    return String.valueOf(Integer.parseInt(acc) + Integer.parseInt(elem));
//                }).get();
//        Helper.show(result);
//        int result = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
//        Helper.show(result);
    //    №3 Дана некоторая строка:
//        String s = "AbCdE";
//    //    Смените регистр букв этой строки на противоположный. В нашем случае должно получится следующее:
//    //    "aBcDe"
//
//        StringBuilder result = s.chars().map(x -> {
//            return Character.isUpperCase(x) ? Character.toLowerCase(x) : Character.toUpperCase(x);
//        }).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
//        Helper.show(result.toString());
    //    №4 Напишите программу, которая сформирует следующую строку:
    //    "-1-2-3-4-5-"
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("-");
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        stream.forEach(x -> {
//            stringBuilder.append(x);
//            stringBuilder.append("-");
//        });
//        Helper.show(stringBuilder.toString());
    //    №5 Дана дата в следующем формате:
//        String date = "31-12-2025";
//    //    Преобразуйте ее в следующий формат:
//    //    String date = "31 декабря 2025";
//        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
//
//        String[] dateArray = date.split("-");
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(dateArray[0]).append(" ").append(months[Integer.parseInt(dateArray[1]) - 1]).append(" ").append(dateArray[2]);
//        Helper.show(stringBuilder.toString());
    }
}

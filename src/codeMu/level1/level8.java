package codeMu.level1;

import codeMu.Helper;

import java.util.HashMap;
import java.util.Map;

public class level8 {

    public static void main(String[] args) {
        // ShowFigires(); // Выведите в консоль все целые числа от 100 до 1.

        // Дана некоторая строка:
        //Переберите и выведите в консоль по очереди все символы с конца строки.
//        String s = "abcde";
//        ShowReverseStroke(s);
        // Дано целое число, содержащее количество байт:
        // Переведите это значение в гигабайты, мегабайты и килобайты.
//        long b = 3535645778L;
//        Map<String, Long> map = convertTo(b);
//        Helper.show(map.get("gb"));
//        Helper.show(map.get("mb"));
//        Helper.show(map.get("kb"));
    }


    static void ShowFigires() {
        int count = 100;
        while (count >= 1) {
            Helper.show(count);
            count--;
        }
    }

    static void ShowReverseStroke(String value) {
//        StringBuilder stringBuilder = new StringBuilder(value);
//        value = stringBuilder.reverse().toString();
//        for(String e : value.split("")) {
//            Helper.show(e);
//        }

        for(int i = value.length() - 1; i >= 0; i--) {
            Helper.show(String.valueOf(value.charAt(i)));
        }
    }

    static Map<String, Long> convertTo(long value) {
        Map<String, Long> map = new HashMap<>();
        Long kb = value / 1024;
        Long mb = kb / 1024;
        Long gb = mb / 1024;
        map.put("gb", gb);
        map.put("mb", mb);
        map.put("kb", kb);
        return map;
    }
}



package codeMu.level1;

import java.util.*;

public class level7 {
    public static void main(String[] args) {
        // Найдите сумму всех целых нечетных чисел в промежутке от 1 до 100. +
//        int sum = sumAllFigures(1, 100);
//        System.out.println(sum);
        // Напишите код, который выведет первые N степеней двойки.
//        int result = stepenDvoyki(3);
//        System.out.println(result);

        // Даны три строки: Сложите значения этих строк как целые числа.
//            String str1 = "123";
//            String str2 = "456";
//            String str3 = "789";
//            List<String> list = new ArrayList<>(Arrays.asList(str1, str2, str3));
//        int result = addUpTheNumbers(list);
//        System.out.println(result);
        // Дано некоторое число: 12345 Переверните его: 54321
//        System.out.println(reverseNumber(12345));
        // Дано некоторое число: 12345 Найдите сумму цифр этого числа.
//        Helper.show(summ(12345));
        // Дано дробное число, содержащее количество гигабайт: Переведите это значение в мегабайты, килобайты и байты.
//        float gb = 35.24F;
//        Map<String, Float> map = convertToMB_KB(gb);
//        Helper.show(Helper.mergeStroke("В ", Float.toString(gb), " гигабайте:"));
//        Helper.show(Helper.mergeStroke("мегобайты : ", map.get("mb").toString()));
//        Helper.show(Helper.mergeStroke("килобайты : ", map.get("kb").toString()));
//        Helper.show(Helper.mergeStroke("байты : ", map.get("b").toString()));
    }

    static int sumAllFigures(int value1, int value2) {
        int sum = 0;
        while (value1 <= value2){
            if(value1 % 2 != 0) {
                sum += value1;
            }
            value1++;
        }
        return sum;
    }

    static int stepenDvoyki(int n) {
        int i = 2;
        int count = 1;
        while (count < n) {
            i *= 2;
            count++;
        }
        return i;
    }

    static int addUpTheNumbers(List<String> list) {
        int sum = 0;
        for(String elem : list) {
            sum += Integer.parseInt(elem);
        }
        return sum;
    }

    static int reverseNumber(int number) {
        Integer i = number;
        String r = i.toString();
        r = new StringBuilder(r).reverse().toString();
        return Integer.parseInt(r);
    }

    static int summ(int number) {
        int sum = 0;
        String s = Integer.toString(number);
        String[] array = s.split("");
        for(String e : array) {
            sum += Integer.parseInt(e);
        }
        return sum;
    }

    static Map<String, Float> convertToMB_KB(float gb) {
        Map<String, Float> map = new HashMap<>();
        float mb = gb * 1024;
        float kb = mb * 1024;
        float b = kb * 1024;
        map.put("mb", mb);
        map.put("kb", kb);
        map.put("b", b);
        return map;
    }
}

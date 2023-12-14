package codeMu.level2;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;

public class level18 {
    public static void main(String[] args) {
        // №1 Дан массив со строками:
//         String[] arr = {"ab", "cd", "ef"};
//        // Получите массив символов этих строк:
//        // char[] {'a', 'b', 'c', 'd', 'e', 'f'}
//        ArrayList<Character> arrayList = new ArrayList<>();
//
//        for(String i : arr) {
//            for(int j = 0; j < i.length(); j++) {
//                arrayList.add(i.charAt(j));
//            }
//        }
//
//        char[] chars = new char[arrayList.size()];
//        for(int i = 0; i < arrayList.size(); i++) {
//            chars[i] = arrayList.get(i);
//        }
//
//        Helper.show(Arrays.toString(chars));



        // №2 Дано целое число, содержащее номер месяца от 1 до 12:
//         byte num = 1;
        // Выведите название месяца, соответствующее этому числу.
//        Helper.show(getMonth(num));

        // №3 Дана строка:
//         String str = "12345";
//        // Получите первый и последний символ этой строки в следующем виде:
//        // String "15";
//        StringBuilder stringBuilder = new StringBuilder();
//        String result = stringBuilder.append(str.charAt(0)).append(str.charAt(str.length() - 1)).toString();
//        Helper.show(result);

        // №4 Даны переменные, содержащие стороны прямоугольника:
//         int a = 10;
//         int b = 20;
//        // Получите площадь и периметр этого прямоугольника.
//        int p = 2 * (a + b);
//        int s = a * b;
//        Helper.show("Периметр прямоугольника = " + p);
//        Helper.show("Площадь прямоугольника = " + s);
    }

    static String getMonth(byte i) {
        String[] month = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        if(i > 12 || i <= 0) {
            return "Передано неверное значение";
        } else {
            return month[i - 1];
        }
    }
}

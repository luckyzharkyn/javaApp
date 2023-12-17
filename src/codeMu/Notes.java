package codeMu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Notes {
    public static void main(String[] args) {
        Convertation(); // конвертация
        putArray(); // элементы положить в массив
        Stroke(); // работа со строками


    }

    static void Convertation() {
        // конвертировать string в int
        int q = Integer.parseInt("1");

        // конвертировать int в string
        int num = 12345;
        // 1
            String strNum = String.valueOf(num);
        // 2
            String strNum2 = Integer.toString(num);

        // конвертировать char в int
        char w = 'b';
        int e = Character.getNumericValue(w);

        // integer конвертировать в string
        Integer value = 9;
        String r = value.toString();

        // отрицательное цисло преобразовать в плюсовое
        Integer value1 = 9;
        int intValue = Math.abs(value1);

        // конвертировать char в string
        char g = 'b';
        String o = String.valueOf(g);

        // конвертировать массив в string
        int[] arr = new int[10];
        Helper.show(Arrays.toString(arr));
    }

    static void putArray() {
        // элементы положить в массив
        String str1 = "123";
        String str2 = "456";
        String str3 = "789";
            // 1
            List<String> list = new ArrayList<>(Arrays.asList(str1, str2, str3));
            // 2
            String[] array1 = {str1, str2, str3};
            // 3
            String[] array2 = new String[3];
            array2[0] = str1;
            array2[1] = str2;
            array2[2] = str3;
            // 4
            List<String> list2 = Arrays.asList(str1, str2, str3);
            String[] array3 = list.toArray(new String[0]);
            // 5
            String combined = str1 + "," + str2 + "," + str3;
            String[] array4 = combined.split(",");
            // 6
            String[] array5 = Stream.of(str1, str2, str3).toArray(String[]::new);
            // 7
            ArrayList<String> month = new ArrayList<>();
            month.add(str1);
            month.add(str2);
            month.add(str3);

            // 8
            String hello = "Zharkyn";
            char[] charList = hello.toCharArray();
    }

    static void Stroke() {
        String s = "Zharkyn";
            // получить элемент строки
            char Z = s.charAt(0);

            // проверить строку на пустоту
            boolean result = s.isEmpty();

            // проверить размер строки
            int size = s.length();

            // замена каких либо букв
            s = s.replace("n", "e");

            // объединение строк
            StringBuilder tr = new StringBuilder();
            tr.append(s).append(" is").append(" cool").reverse();
            s = tr.toString();

    }

}

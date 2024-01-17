package codeMu.level5;

import codeMu.Helper;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class level47 {
    public static void main(String[] args) {
        // №1 Выведите в консоль все числа в промежутке от 10 до 1000, сумма первой и второй цифры которых равна пяти.
//        for(int i = 10; i < 1000; i++) {
//            String s = Integer.toString(i);
//            if(Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1)) == 5) {
//                Helper.show(s);
//            }
//        }
        //№2 Дан массив:
//        int[][] ints  = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//        };
        //Слейте элементы этого массива в один одномерный массив:
        //{1, 2, 3, 4, 5, 6, 7, 8, 9}
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Arrays.stream(ints).flatMapToInt(Arrays::stream).forEach(x -> arrayList.add(x));
//
//        int[] newInt = new int[arrayList.size()];
//        for(int i = 0; i < arrayList.size(); i++) {
//            newInt[i] = arrayList.get(i);
//        }
//        Helper.show(Arrays.toString(newInt));

        //№3 Даны две строки:
        String str1 = "12345";
        String str2 = "45678";

        //Получите символы, которые есть и в одной, и в другой строке:
        //"45"
        String result = Arrays.toString(str1.chars().filter(x -> {
            AtomicBoolean flag = new AtomicBoolean(false);
            str2.chars().forEach(x2 -> {
                if (Character.getNumericValue(x2) == Character.getNumericValue(x)) {
                    flag.set(true);
                }
            });
            return flag.get();
        }).toArray());
//        .collect(Collectors.joining(""));
        Helper.show(result);
    }
}

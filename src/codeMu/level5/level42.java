package codeMu.level5;

import codeMu.Helper;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class level42 {
    public static void main(String[] args) {
        //№1 Попросите у пользователя ввести через консоль 10 чисел. Заполните массив этими числами.

        //№2 Дан массив:
//        int[][] arr = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//        };
//        //Найдите сумму элементов этого массива.
//        int sum = Arrays.stream(arr)
//                .flatMapToInt(Arrays::stream)
//                .reduce((acc, elem) -> acc + elem)
//                .orElse(0);
//        Helper.show(sum);


        //№3 Дан массив с целыми числами:
//        int[] arr = {100, 200, 300, 400, 500};
//        //Выведите в консоль элементы этого массива, первая цифра которых равна 1 или 2.
//        Arrays.stream(arr).filter(x -> {
//            String s = String.valueOf(x);
//            char c = s.charAt(0);
//            if(c == '1' || c == '2') {
//                return true;
//            }
//            return false;
//        }).forEach(Helper::show);

        //№4 Дан массив с целыми числами:
//        int[] arr = {123, 987, 345, 567};
//        //Получите второй элемент, содержащий в себе цифру 3:
//        //345
//
//        List<Integer> list = Arrays.stream(arr)
//                .filter(x -> String.valueOf(x).contains("3"))
//                .skip(1)
//                .limit(1)
//                .boxed()
//                .collect(Collectors.toList());
//        Helper.show(list.get(0));

        //№5 Напишите программу, которая выведет в консоль следующую пирамидку:
        //1
        //22
        //333
        //4444
        //55555
//        int count = 1;
//
//        for(int i = 0; i < 5; i++) {
//            StringBuilder stringBuilder = new StringBuilder();
//            for(int j = 0; j < i + 1; j++) {
//                stringBuilder.append(count);
//            }
//            count++;
//            Helper.show(stringBuilder.toString());
//        }
    }
}

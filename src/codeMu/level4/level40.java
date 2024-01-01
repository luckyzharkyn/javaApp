package codeMu.level4;

import codeMu.Helper;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class level40 {
    public static void main(String[] args) {
        //№1 Дан некоторый массив, например, вот такой:
        int[] arr = {1, 2, 3, 4, 5, 6};
        //Поделите сумму элементов, стоящих на четных позициях, на сумму элементов, стоящих на нечетных позициях.
//        int sum = 0;
//        int sum2 = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(i % 2 == 0) {
//                sum += arr[i];
//            } else {
//                sum2 += arr[i];
//            }
//        }
//
//        int result = sum / sum2;
//        Helper.show(result);
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        int sum1 = Arrays.stream(arr)
//                .filter(x -> atomicInteger.getAndIncrement() % 2 == 0)
//                .sum();
//        atomicInteger.set(0);
//        int sum2 = Arrays.stream(arr)
//                .filter(x -> atomicInteger.getAndIncrement() % 2 != 0)
//                .sum();
//        if(sum2 != 0) {
//            double value = (double) sum1 / sum2;
//            Helper.show(value);
//        }
        //№2 Дана некоторая строка:
//        String s = "a bc def ghij";
//        //Переведите в верхний регистр все подстроки, в которых количество букв меньше или равно трем.
//        // В нашем случае должно получится следующее:
//        //"A BC DEF ghij"
//        String[] arrays = s.split(" ");
//        String result = Arrays.stream(arrays)
//                .map(x -> x.length() <= 3 ? x.toUpperCase() : x)
//                .collect(Collectors.joining(" "));
//        Helper.show(result);

        //№3 Дана некоторая строка со словами:
//        String s = "aaa bbb ccc eee fff";
        //Сделайте заглавным первый символ каждого второго слова в этой строке. В нашем случае должно получится следующее:
        //"aaa Bbb ccc Eee fff"
//        AtomicInteger atomicInteger = new AtomicInteger(0);
//        String result = Arrays.stream(s.split(" "))
//                .map(x -> {
//                    StringBuilder stringBuilder = new StringBuilder();
//                    return atomicInteger.getAndIncrement() % 2 != 0
//                            ? stringBuilder
//                                .append(x.substring(0, 1).toUpperCase())
//                                .append(x.substring(1)).toString()
//                            : x;
//                })
//                .collect(Collectors.joining(" "));
//        Helper.show(result);
    }
}

package codeMu.level4;

import codeMu.Helper;
import codeMu.Month;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class level39 {
    public static void main(String[] args) {
        //№1 Дана строка с буквами и цифрами:
//        String str = "a1b2c345";
//        //Проверьте, что в этой строке не более трех букв.
//
//        AtomicInteger count = new AtomicInteger();
//
//        str.chars()
//                .mapToObj(x -> (char) x)
//                .filter(Character::isLetter)
//                .limit(3)
//                .peek(Helper::show)
//                .forEach(c -> count.incrementAndGet());
//
//
//        if(count.get() > 3) {
//            Helper.show("more 3");
//        } else {
//            Helper.show("not more 3");
//        }

        //№2 Дан массив:
//        int[] arr = new int[10];
//        //С помощью цикла заполните этот массив случайными целыми числами из промежутка от 1 до 100.
//        Random random = new Random();
//
//        arr = Arrays.stream(arr)
//                .map(x -> random.nextInt(100) + 1)
//                .toArray();
//        Helper.show(Arrays.toString(arr));
        //№3 Дана некоторая строка:
        String s = "abcdefg";
        //Удалите из этой строки каждый третий символ. В нашем случае должно получится следующее:
        //"abdeg"
//        StringBuilder stringBuilder = new StringBuilder();
//        AtomicInteger atomicInteger = new AtomicInteger();
//
//        s.chars().forEach(x -> {
//            if(atomicInteger.get() == 2) {
//                atomicInteger.set(0);
//            } else {
//                atomicInteger.incrementAndGet();
//                stringBuilder.append((char) x);
//            }
//        });
//        Helper.show(stringBuilder.toString());

//        String result = s.chars()
//                .filter(i -> {
//                    Helper.show(i);
//                    return i % 3 != 2;
//                })
//                .mapToObj(c -> (char) c)
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//        Helper.show(result);

        //№4 Дан массив с номерами месяцев:
//        byte[] arr = {1, 2, 8};
//        //Запишите в новый массив названия этих месяцев:
//        //String[] {"янв", "фев", "авг"}
//        String[] newArray = new String[arr.length];
//        for(int i = 0; i < arr.length; i++) {
//            Map<String, Object> map = Month.getMonth(arr[i]);
//            if(map.get("code").equals(200)) {
//                newArray[i] = String.valueOf(map.get("value"));
//            }
//        }
//        Helper.show(Arrays.toString(newArray));
    }
}

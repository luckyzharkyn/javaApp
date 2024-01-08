package codeMu.level5;

import codeMu.Helper;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class level44 {
    public static void main(String[] args) {
        //№1 Дано некоторое целое число:
//        int num = 12345;
        //Проверьте, что цифры этого числа расположены по возрастанию.
//        String s = String.valueOf(num)
//                .chars()
//                .mapToObj(Character::toString)
//                .sorted()
//                .peek(Helper::show)
//                .collect(Collectors.joining());
//
//        Helper.show(s);
//        if(num == Integer.parseInt(s)) {
//            Helper.show("yes");
//        } else {
//            Helper.show("no");
//        }
        //№2 Дан некоторый массив:
//        int[] arr = {123, 456, 789};
//        //Получите массив первых цифр входящих в первый массив чисел:
//        //byte[] {1, 4, 7};
//        byte[] newByte = new byte[arr.length];
//        AtomicInteger atomicInteger = new AtomicInteger();
//        Arrays.stream(arr)
//                .map(x -> String.valueOf(x).charAt(0))
//                .forEach(x -> newByte[atomicInteger.getAndIncrement()] = (byte) Character.getNumericValue(x));
//
//        for(int i = 0; i < newByte.length; i++) {
//            Helper.show(newByte[i]);
//        }

        //№3 Сформируйте с помощью циклов следующий массив:
        //char[] {
        //    {'x', 'x', 'x'},
        //    {'x', 'x', 'x'},
        //    {'x', 'x', 'x'},
        //}

//        char[][] chars = new char[3][3];
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                chars[i][j] = 'x';
//            }
//        }
//
//        Arrays.stream(chars)
//                .forEach(x -> Helper.show(Arrays.toString(x)));

    }
}

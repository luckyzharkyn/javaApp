package codeMu.level4;

import codeMu.Helper;

import java.util.Arrays;

public class level36 {
    public static void main(String[] args) {
        //№1 Дана строка. Проверьте, что эта строка состоит только из цифр.
//        String s = "24242334";
//
//        if(s.matches("\\d+")) {
//            Helper.show("yes");
//        }
        //№2 Дано целое число:
//        int num = 12345;
//        //Получите первую четную цифру с конца этого числа.
//        String s = Integer.toString(num);
//        for(int i = s.length() - 1; i >= 0; i--) {
//            if(Character.getNumericValue(s.charAt(i) % 2) == 0) {
//                Helper.show(s.charAt(i));
//                break;
//            }
//        }
        //№3 Напишите программу, которая сформирует следующую строку:
        //"54321"
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i : new int[] {5, 4, 3, 2, 1}) {
//            stringBuilder.append(i);
//        }
//        Helper.show(stringBuilder.toString());
        //№4 Дан массив с целыми числами:
//        int[] arr = {123, 102, 345, 350};
//        //Выведите в консоль только те числа, которые содержат цифру ноль.
//        for(int i : arr) {
//            String s = String.valueOf(i);
//            if(s.indexOf("0") != -1) {
//                Helper.show(i);
//            }
//        }
//        Arrays.stream(arr)
//                .forEach(Helper::show);
        //№5 Дана строка:
//        String s = "abcdef";
//        String result = s.chars()
//                .filter(index -> index % 2 == 0)
//                .mapToObj(index -> (char) index)
//                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
//                .toString();
//
//        Helper.show(result);

        //№6 Дан массив:
//        int[] arr = {1, 2, 3, 0, 4, 0, 5, 0};
//        //Создайте новый массив так, чтобы в новом массиве были все элементы первого массива, за исключением элементов со значением 0.
//        int[] newArray = Arrays.stream(arr).filter(x -> x != 0).toArray();
//        Helper.show(Arrays.toString(newArray));
    }
}

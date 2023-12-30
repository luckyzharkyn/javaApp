package codeMu.level4;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;

public class level35 {
    public static void main(String[] args) {
    //    №1 Выведите в консоль все числа от 1 до 1000, сумма цифр которых равна 13.
//        for (int i = 1; i <= 1000; i++) {
//            String s = Integer.toString(i);
//            int sum = 0;
//            for(int j = 0; j < s.length(); j++) {
//                sum += Character.getNumericValue(s.charAt(j));
//            }
//            if(sum == 13) {
//                Helper.show(i);
//            }
//        }
    //    №2 Даны значения в пикселях, содержащие целые числа:
//        String size1 = "12px";
//        String size2 = "15px";
//    //    Сложите эти значения так, чтобы результат также был в пикселях:
//    //    "27px"
//        String newSize1 = size1.replace("px", "");
//        String newSize2 = size2.replace("px", "");
//        int sum = Integer.parseInt(newSize1) + Integer.parseInt(newSize2);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(sum).append("px");
//        Helper.show(stringBuilder.toString());

    //    №3 Дан массив:
//          int[] array = {1, 2, 3};
//    //    Создайте новый массив так, чтобы в нем каждый элемент первого массива повторился два раза:
//    //    int[] {1, 1, 2, 2, 3, 3}
//          int[] newArray = new int[array.length * 2];
//          int index = 0;
//
//          for(int elem : array) {
//              newArray[index++] = elem;
//              newArray[index++] = elem;
//          }
//          Helper.show(Arrays.toString(newArray));

    //    №4 Дан массив:
//        int[] arr = {1, 2, 3, 4, 5};
//    //    Создайте новый массив так, чтобы в новом массиве были все элементы первого массива, за исключением N первых элементов.
//        int N = 2;
//
//        int[] newArray = Arrays.copyOfRange(arr, N, arr.length);
//        Helper.show(Arrays.toString(newArray));
    }
}

package codeMu.level3;

import codeMu.Helper;

import java.util.Arrays;

public class level29 {
    public static void main(String[] args) {
        //    №1 Дана некоторая строка, например, вот такая:
//            String str = "023m0df0dfg0";
//        //    Выведите в консоль позиции всех нулей в этой в строке.
//            char[] newCharArray = str.toCharArray();
//            for(int i = 0; i < newCharArray.length; i++) {
//                if(newCharArray[i] == '0') {
//                    Helper.show(i);
//                }
//            }
        //    №2 Дан некоторый массив, например, вот такой:
//            int[] arr = {1, 2, 3, 4, 5, 6};
//        //    Поделите сумму первой половины элементов этого массива на сумму второй половины элементов.
//            double firstSum = 0;
//            double secondSum = 0;
//            for(int i = 0 ; i < arr.length; i++) {
//                if(arr.length / 2 >= i + 1) {
//                    firstSum += arr[i];
//                } else {
//                    secondSum += arr[i];
//                }
//            }
//            double result = firstSum/secondSum;
//            Helper.show(result);

        //    №3 Дан массив со строками:
//            String[] arr = {"ab", "cd", "ef"};
//        //    Получите массив символов этих строк:
//
//        //    chars[] {'a', 'b', 'c', 'd', 'e', 'f'};
//            char[] newCharArray = String.join("", arr).toCharArray();
//            Helper.show(Arrays.toString(newCharArray));

        //    №4 Даны два массива:
//            int[] arr1 = {1, 2, 3};
//            int[] arr2 = {4, 5, 6};
//        //    Переберите эти массивы одним циклом и в каждой итерации выводите их элементы следующим образом:
//
//        //    "1,4"
//        //    "2,5"
//        //    "3,6"
//
//            for(int i = 0; i < arr1.length; i++) {
//                String s1 = String.valueOf(arr1[i]);
//                String s2 = String.valueOf(arr2[i]);
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append(s1).append(",").append(s2);
//                Helper.show(stringBuilder.toString());
//            }

        //    №5 Дано некоторое целое число:
//              int num = 12;
//        //    Преобразуйте его в двоичную систему.
//              boolean b = true;
//              int octatok;
//              StringBuilder stringBuilder = new StringBuilder();
//              while (b) {
//                  octatok = num % 2;
//                  num = num / 2;
//                  if(num == 0) {
//                      b = false;
//                  }
//                  stringBuilder.append(String.valueOf(octatok));
//              }
//              Helper.show(stringBuilder.reverse().toString());
    }
}

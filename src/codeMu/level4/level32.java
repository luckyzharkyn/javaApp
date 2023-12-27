package codeMu.level4;

import codeMu.Helper;

import java.util.ArrayList;

public class level32 {
    public static void main(String[] args) {
        //    №1 Выведите в консоль все числа в промежутке от 10 до 1000, у которых первая цифра четная.
//             for(int i = 10; i < 1000; i++) {
//                 if(i >= 10) {
//                     int figure = Character.getNumericValue(String.valueOf(i).charAt(0));
//                     if(figure % 2 == 0) {
//                         Helper.show(i);
//                     }
//                 }
//             }
        //    №2 Дано целое число:
//            int num = 12345;
//        //    Выведите в консоль количество четных цифр в этом числе.
//            char[] s = String.valueOf(num).toCharArray();
//            int count = 0;
//            for(char c : s) {
//                int i = Character.getNumericValue(c);
//                if(i % 2 == 0) {
//                    count++;
//                }
//            }
//            Helper.show(count);

        //    №3 Дано целое число:
//            int num = 12;
//        //    Выведите в консоль все делители этого числа.
//              for(int i = num; i >= 1; i--) {
//                  if(num % i == 0) {
//                      Helper.show(i);
//                  }
//              }

        //    №4 Даны два массива:
//            int[] arr1 = {1, 2, 3, 4, 5};
//            int[] arr2 = {1, 2, 3};
//            // Проверьте, что все элементы первого массива есть во втором.
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            for(int i : arr1) {
//                for(int j : arr2) {
//                    if(i == j) {
//                        arrayList.add(1);
//                        break;
//                    }
//                }
//            }
//            if(arrayList.size() == arr1.length) {
//                Helper.show("yes");
//            } else {
//                Helper.show("no");
//            }

        //    №5 Дано целое число:
//            int num = 12345;
//        //    Поменяйте местами первую и последнюю цифру этого числа:
//        //    int 52341
//            String s = String.valueOf(num);
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.append(s.charAt(s.length() - 1)).append(s.substring(1, s.length() - 1)).append(s.charAt(0));
//            String res = stringBuilder.toString();
//            Helper.show(res);
    }
}

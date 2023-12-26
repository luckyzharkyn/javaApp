package codeMu.level4;

import codeMu.Helper;

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
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {1, 2, 3};
            // Проверьте, что все элементы первого массива есть во втором.
            boolean res = true;
            for(int i : arr1) {
                for(int j : arr2) {
                    if(arr1[i] != arr2[j]) {
                        res = false;
                    }
                }
            }
            Helper.show(res);

        //    №5 Дано целое число:
        //    int num = 12345;
        //    Поменяйте местами первую и последнюю цифру этого числа:
        //    int 52341
    }
}

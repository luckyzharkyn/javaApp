package codeMu.level4;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class level33 {
    public static void main(String[] args) {
        //    №1 Выведите в консоль все числа в промежутке от 10 до 1000, у которых предпоследняя цифра четная.
//              for(int i = 10; i < 1000; i++) {
//                 String s = String.valueOf(i);
//                 char c = s.charAt(s.length() - 2);
//                 int e = Character.getNumericValue(c);
//                 if(e % 2 == 0) {
//                     Helper.show(i);
//                 }
//              }
        //    №2 Напишите программу, которая сформирует следующую строку:
        //    "123456789"
//              StringBuilder s = new StringBuilder();
//              int count = 1;
//              while (count <= 9) {
//                  s.append(count);
//                  count++;
//              }
//              Helper.show(s.toString());

        //    №3 Даны два целых числа:
//              int num1 = 12;
//              int num2 = 16;
//        //    Выведите в консоль общие делители этих чисел.
//             ArrayList<Integer> arrayList1 = findDelitely(num1);
//             ArrayList<Integer> arrayList2 = findDelitely(num2);
//             findGeneral(arrayList1, arrayList2);

        //    №4 Дана строка с целыми числами, разделенными пробелами:
//              String str = "123 456 789";
//        //    Найдите сумму чисел из этой строки.
//              String[] arrays = str.split(" ");
//              int sum = 0;
//              for(String num : arrays) {
//                  int w = Integer.parseInt(num);
//                  sum += w;
//              }
//              Helper.show(sum);

        //    №5 Дана строка со словами:
//              String str = "word1 word2 word3";
//        //    Получите первые N слов из этой строки.
//              String[] arrays = str.split(" ");
//              int N = 3;
//              StringBuilder stringBuilder = new StringBuilder();
//              for(int i = 0; i < arrays.length; i++) {
//                  if(i + 1 < N) {
//                      stringBuilder.append(arrays[i]).append(" ");
//                  } else if(i + 1 == N) {
//                      stringBuilder.append(arrays[i]);
//                  }
//
//              }
//              String res = stringBuilder.toString();
//              Helper.show(res);
    }

    static ArrayList<Integer> findDelitely(int value) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i < value; i++) {
            if(value % i == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }


    static void findGeneral(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(Integer i : arr1) {
            if(arr2.contains(i)) {
                arrayList.add(i);
            }
        }
        Helper.show(arrayList.toString());
    }
}

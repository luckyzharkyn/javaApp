package codeMu.level3;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;

public class level28 {
    public static void main(String[] args) {
        //    №1 Дан массив с целыми числами. Проверьте, что все числа из этого массива содержат в себе цифру 3.
//              int[] array = {12345, 23451, 34561, 75524};
//              int count = 0;
//              for(int i : array) {
//                  String s = String.valueOf(i);
//                  if(s.contains("3")) {
//                      count++;
//                  }
//              }
//              if(array.length == count) {
//                  Helper.show("yes");
//              }


        //    №2 Дана некоторая строка:
//              String s = "12034050607";
//        //    Найдите позицию третьего нуля в строке.
//              int count = 0;
//              for(int i = 0; i < s.length(); i++) {
//                  if(s.charAt(i) == '0') {
//                      count++;
//                  }
//                  if(count == 3) {
//                      Helper.show(i);
//                      break;
//                  }
//              }

        //    №3 Через запятую написаны целые числа:
//              String str = "1,2,10,100,3";
//        //    Получите максимальное из этих чисел.
//              String[] array = str.split(",");
//              int max = 0;
//              for(String s : array) {
//                  int i = Integer.parseInt(s);
//                  if(i > max) {
//                      max = i;
//                  }
//              }
//              Helper.show(max);

        //    №4 Дана строка:
//            String str = "abcde";
//        //    Получите массив символов этой строки:
//        //    char[] {'a', 'b', 'c', 'd', 'e'}
//            char[] charArray = str.toCharArray();
//            Helper.show(Arrays.toString(charArray));

        //    №5 Дана строка в формате:
//            String s = "kebab-case";
//        //    Преобразуйте ее в формат:
//        //    "snake_case"
//            String newS = s.replace("kebab", "snake");
//            Helper.show(newS);

        //    №6 Дана строка в формате:
//            String s = "snake_case";
//
//            String[] sArray = s.split("_");
//            String[] newArray = new String[sArray.length];
//
//            for (int i = 0; i < sArray.length; i++) {
//                newArray[i] = i == 0 ? sArray[i] : sArray[i].substring(0, 1).toUpperCase() + sArray[i].substring(1);
//            }
//
//            String result = String.join("", newArray);
//            Helper.show(result);

        //    №7 Дана строка в формате:
//              String s = "camelCase";
//        //    Преобразуйте ее в формат:
//        //    "camel_case"
//              char[] newCharArray = s.toCharArray();
//              ArrayList<String> arrayList = new ArrayList<>();
//              StringBuilder stringBuilder = new StringBuilder();
//
//              for(char c : newCharArray) {
//                  if(Character.isUpperCase(c)) {
//                    arrayList.add(stringBuilder.toString());
//                    stringBuilder = new StringBuilder();
//                    stringBuilder.append(Character.toLowerCase(c));
//                  } else {
//                      stringBuilder.append(c);
//                  }
//              }
//              arrayList.add(stringBuilder.toString());
//              String result = String.join("_", arrayList);
//              Helper.show(result);
    }
}

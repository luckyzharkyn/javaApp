package codeMu.level4;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;

public class level34 {
    public static void main(String[] args) {
        //    №1 Дана строка. Удалите из нее все гласные буквы.
//            String s = "Zharkyn";
//            Helper.show(removeGlasynye(s));


        //    №2 Дано целое число. Проверьте, что у этого числа есть только один делитель, кроме него самого и единицы.
//         int figure = 34;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i = 2; i < figure; i++) {
//            if(figure % i == 0) {
//                arrayList.add(i);
//            }
//        }
//        Helper.show(arrayList.toString());

        //    №3 Напишите программу, которая сформирует следующую строку:
        //    "xxx xxx xxx"
//        StringBuilder stringBuilder = new StringBuilder();
//        int finish = 3;
//        for(int i = 0; i < finish; i++) {
//            if(i == finish - 1) {
//                stringBuilder.append("xxx");
//            } else {
//                stringBuilder.append("xxx").append(" ");
//            }
//        }
//        Helper.show(stringBuilder.toString());

        //    №4 Дан массив:
//        int[] array =  {1, 2, 3, 4, 5, 6, 7};
////        //    Получите из него каждый второй элемент:
////        //    int[] [1, 3, 5]
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i = 0; i < array.length; i+= 2) {
//            arrayList.add(array[i]);
//        }
//
//        int[] newArray = new int[arrayList.size()];
//        for(int i = 0; i < arrayList.size(); i++) {
//            newArray[i] = arrayList.get(i);
//        }
//        Helper.show(Arrays.toString(newArray));

        //    №5  Дан массив символов, содержащий цифры:
//            char[] arraysChar = {'1', '2', '3', '4', '5'};
//        //    Слейте элементы этого массива в целое число:
//        //    int 12345
//            StringBuilder stringBuilder = new StringBuilder();
//            for(char c : arraysChar) {
//                stringBuilder.append(c);
//            }
//            Helper.show(stringBuilder.toString());
    }

    static String removeGlasynye(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(!isVowel(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    static boolean isVowel(char c) {
        return "aeiouyAEIOUY".indexOf(c) != -1;
    }
}

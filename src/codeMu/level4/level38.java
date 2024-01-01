package codeMu.level4;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class level38 {
    public static void main(String[] args) {
        //№1 Дана строка с буквами:
//        String str = "Aaa Bbb Ccc";
//        //Проверьте, что в этой строке не более двух заглавных букв.
//
//        long res = str.chars().filter(Character::isUpperCase).count();
//        if(res > 2) {
//            Helper.show("yes");
//        }

        //№2 Дана дата в следующем формате:
//        String str = "2025-12-31";
//        //Преобразуйте эту дату в следующий массив:
//        //String[] {"31", "12", "2025"}
//        String[] newArray = str.split("-");
//        newArray = new String[]{newArray[2], newArray[1], newArray[0]};
//        Helper.show(Arrays.toString(newArray));

        //№3 Дана некоторая строка со словами:
//        String s = "aaa bbb ccc";
//        //Сделайте заглавным первый символ каждого слова в этой строке. В нашем случае должно получится следующее:
//        //"Aaa Bbb Ccc"
//        String[] ss = s.split(" ");
//        String result = Arrays.stream(ss).map(x -> {
//            return x.substring(0, 1).toUpperCase() + x.substring(1);
//        }).collect(Collectors.joining(" "));
//        Helper.show(result);

        //№4 Дан массив символов:
//        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
//        //Слейте эти символы попарно в виде строк:
//        //String[] {"ab", "cd", "ef"}
//        StringBuilder stringBuilder = new StringBuilder();
//        int count = 0;
//        ArrayList<String> arrays = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++) {
//            if(count > 1) {
//                count = 0;
//                arrays.add(stringBuilder.toString());
//                stringBuilder.setLength(0);
//            }
//            if(i + 1 == arr.length) {
//                stringBuilder.append(arr[i]);
//                arrays.add(stringBuilder.toString());
//                stringBuilder.setLength(0);
//                break;
//            }
//            stringBuilder.append(arr[i]);
//            count++;
//        }
//        Helper.show(arrays.toString());
    }
}

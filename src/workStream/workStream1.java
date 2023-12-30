package workStream;

import codeMu.Helper;

import java.util.*;
import java.util.stream.Collectors;

public class workStream1 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("privet");
//        list.add("kak dela");
//        list.add("OK");
//        list.add("poka");
//
////        for(int i = 0; i < list.size(); i++) {
////            list.set(i, String.valueOf(list.get(i).length()));
////        }
////        Helper.show(list.toString());
//
//       List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
//       Helper.show(list2.toString());

//       int[] array = {5, 9, 3, 8, 1};
//        array = Arrays.stream(array).map(x -> {
//            if(x % 3 == 0) {
//                x = x / 3;
//            }
//            return x;
//        }).toArray();
//        Helper.show(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OK");
        set.add("poka");
        Helper.show(set);
        List<Integer> list2 = set.stream().map(x-> {
            return x.length();
        }).collect(Collectors.toList());
        Helper.show(list2);
    }
}

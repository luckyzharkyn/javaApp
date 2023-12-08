package codeMu;

import java.util.ArrayList;

public class Helper {
    static <T> void show(T value) {
        System.out.println(value);
    }

    static <T> void showArray(ArrayList<T> arrayList) {
        for(T element : arrayList) {
            Helper.show(element);
        }
    }

    static String mergeStroke(String... values) {
        StringBuilder s = new StringBuilder();
        for(String e : values) {
            s.append(e);
        }
        return s.toString();
    }
}

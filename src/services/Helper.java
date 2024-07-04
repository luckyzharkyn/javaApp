package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

import static java. lang.System.*;

public class Helper {
    /**
     * для показа сообщения
     * @param value Принимает значение любого типа
     */
    public static <T> void show(T value) {
        out.println(value);
    }

    public static <T> void show(String text, T value) {
        out.println(text + "::: " + value);
    }

    /**
     * для показа сообщении
     * @param arrayList принимает массив значении любого типа
     */
    public static <T> void showArray(ArrayList<T> arrayList) {
        arrayList.stream().forEach(Helper::show);
    }

    /**
     * объединяет строки
     * @param values - принимает несколько строк
     * @return - возвращает объединенную строку
     */
    public static String mergeStroke(String... values) {
        StringBuilder s = new StringBuilder();
        for(String e : values) {
            s.append(e);
        }
        return s.toString();
    }

    /**
     * для получения суммы
     * @param array - принимает массив чисел
     * @return - возвращает сумму
     */
    public static int sumArray(int[] array) {
        return Arrays.stream(array).reduce((acc, elem) -> acc + elem).getAsInt();
    }

    public static String generateId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}

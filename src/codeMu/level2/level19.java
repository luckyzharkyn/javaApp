package codeMu.level2;

import codeMu.Helper;

import java.util.Arrays;

public class level19 {
    public static void main(String[] args) {
        // №1 С помощью цикла заполните массив четными числами из промежутка от 1 до 100.
//        int[] arrayInt = new int[100];
//        for(int i = 0; i < 100; i++) {
//            arrayInt[i] = i + 1;
//        }
//        Helper.show(Arrays.toString(arrayInt));
        // №2 Дан массив с целыми числами:
//         int[] arr = {1, 2, 3, 4, 5};
        // Поменяйте местами первый и второй элементы этого массива:
        // int[] {2, 1, 3, 4, 5};
//        int temp = arr[1];
//        arr[1] = arr[0];
//        arr[0] = temp;
//        Helper.show(Arrays.toString(arr));



        // №3 Дано целое число, содержащее номер дня недели от 1 до 7:
//         byte num = 8;
//        // Определите, эта переменная содержит выходной или будний день.
//        Helper.show(getDay(num));
        // №4 Дана переменная, содержащая температуру в градусах Цельсия:
//         short tc = 25;
//        // Напишите программу, которая преобразует эту температуру в градусы Фарингейта.
//        Helper.show(getFarengeit(tc));
    }

    static String getDay(byte day) {
        String[] days = {"Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"};
        if(day == 6 || day == 7) {
            return "Это выходной день = " + days[day - 1];
        } else if(day > 0 && day < 6) {
            return "Это будний день = " + days[day - 1];
        } else{
            return "Введено некорретный день недели";
        }
    }

    static double getFarengeit(short tc) {
        return (tc * 1.8) + 32;
    }
}

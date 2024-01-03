package codeMu.level5;

import codeMu.Helper;

import java.util.*;

public class level41 {
    public static void main(String[] args) {
        //№1 Попросите у пользователя ввести через консоль два числа. Выведите сумму этих чисел.
//        Scanner scanner = new Scanner(System.in);
//        Helper.show("enter first value: = ");
//        double firstValue = scanner.nextDouble();
//        Helper.show("enter second value: = ");
//        double secondValue = scanner.nextDouble();
//        double sum = firstValue + secondValue;
//        Helper.show(Helper.mergeStroke("Your results is ", String.valueOf(sum)));
        //№2 Дано число:
//        int num = 133;
//        //Определите, есть ли среди цифр этого числа одинаковые.
//        String s = String.valueOf(num);
//        boolean result = s.chars().anyMatch(c -> s.chars().filter(x -> x == c).count() > 1);
//        if(result) {
//            Helper.show("yes");
//        }


        //№3 Дан массив:
//        int[][] arr = {
//        {1, 2, 3},
//        {4, 5, 6},
//        {7, 8, 9},
//        };
//        //Выведите в консоль все элементы этого массива.
//        Arrays.stream(arr)
//                .flatMapToInt(Arrays::stream)
//                .forEach(Helper::show);

        //№4 Напишите программу, которая выведет в консоль следующую пирамидку:
        //x
        //xx
        //xxx
        //xxxx
        //xxxxx
//        for(int i = 0; i < 5; i++) {
//            StringBuilder s = new StringBuilder();
//            for(int j = 0; j < i + 1; j++) {
//                s.append("x");
//            }
//            Helper.show(s.toString());
//        }
    }
}

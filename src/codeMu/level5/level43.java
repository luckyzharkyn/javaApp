package codeMu.level5;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Scanner;

public class level43 {
    public static void main(String[] args) {
        //№1 Попросите у пользователя ввести через консоль 10 чисел. В ответ выведите сумму этих чисел.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            if(scanner.hasNextInt()) {
                arrayList.add(scanner.nextInt());
            }
        }
        Helper.show(arrayList.stream().reduce((acc, elem) -> acc + elem).get());
        //№2 Напишите программу, которая выведет в консоль следующую пирамидку:
        //55555
        //4444
        //333
        //22
        //1

        //№3 Дан массив:
        //int[][][] arr = {
        //        {
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //        },
        //        {
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //        },
        //        {
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //                {1, 2, 3, 4, 5},
        //        },
        //};
        //Выведите в консоль сумму всех элементов этого массива.
    }
}

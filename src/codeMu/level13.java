package codeMu;

import java.util.Arrays;

public class level13 {
    public static void main(String[] args) {
        //  №1 Дан массив с целыми числами:
//          int[] arr = {1, 2, 3, 4, 5};
        // Найдите сумму квадратов элементов этого массива.
//        sumSquare(arr);

        //№2 Дан массив с целыми числами:
//         int[] arr = {1, 2, 3, 4, 5};
        // Найдите среднее арифметическое этого массива.
//        avgAriv(arr);

        //№3 Дан массив:
//        int max = 10;
//         int[] arr = new int[max];
        // С помощью цикла заполните этот массив целыми числами от 1 до 10.
//        fullArray(arr, 1, max);
    }

    static void sumSquare(int[] arr) {
        int sum = 0;
        for(int elem : arr) {
            sum += elem * elem;
        }
        Helper.show(sum);
    }

    static void avgAriv(int[] array) {
        int sum = 0;
        for(int elem : array) {
            sum += elem;

        }
        Helper.show(sum / array.length);
    }

    static void fullArray(int[] array, int min, int max) {
        for(int i = min; i < max; i++) {
            array[i] = i;
        }
        Helper.show(Arrays.toString(array));
    }
}

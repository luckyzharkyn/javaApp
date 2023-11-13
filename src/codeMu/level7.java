package codeMu;

public class level7 {
    public static void main(String[] args) {
        // Найдите сумму всех целых нечетных чисел в промежутке от 1 до 100. +
        int sum = sumAllFigures(1, 100);
        System.out.println(sum);
        // TODO Напишите код, который выведет первые N степеней двойки.
        // TODO Даны три строки: Сложите значения этих строк как целые числа.
//            String str1 = "123";
//            String str2 = "456";
//            String str3 = "789";

        // TODO Дано некоторое число: 12345 Переверните его: 54321
        // TODO Дано некоторое число: 12345 Найдите сумму цифр этого числа.
        // TODO Дано дробное число, содержащее количество гигабайт: Переведите это значение в мегабайты, килобайты и байты.
//            float gb = 35.24F;

    }

    static int sumAllFigures(int value1, int value2) {
        int sum = 0;
        while (value1 <= value2){
            if(value1 % 2 != 0) {
                sum += value1;
            }
            value1++;
        }
        return sum;
    }

    static int stepenDvoyki(int n) {
        return 0;
    }
}

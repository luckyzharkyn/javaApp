package codeMu;

public class level12 {
    public static void main(String[] args) {
        // №1 Найдите среднее арифметическое всех целых чисел от 1 до 100.
//        avg(1, 100);

        //№2  Дано число:
//         int num = 12345;
        // Найдите сумму первой и последней цифры этого числа.
//        sumFirstLastFigure(num);

        //№3 Дан массив с целыми числами:
//         int[] arr = {1, 2, 3, 4, 5};
//         Найдите сумму элементов этого массива.
//        Helper.show(Helper.sumArray(arr));

        //№4 Дано некоторое целое число:
//         int num = 12345;
        // Выведите в консоль все его цифры с конца.
//        reverseFigures(num);
    }

    static void avg(int a, int b) {
        int sum = 0;
        int count = 0;
        for(int c = a; c <= b; c++) {
            sum += c;
            count = c;
        }
        Helper.show(sum);
        Helper.show(count);
        Helper.show(sum/count);
    }

    static void sumFirstLastFigure(int value) {
        String s = Integer.toString(value);
        char firstNumber = s.charAt(0);
        char lastNumber = s.charAt(s.length()-1);
        int sum = Character.getNumericValue(firstNumber) + Character.getNumericValue(lastNumber);
        Helper.show(sum);
    }

    static void reverseFigures(int value) {
        String s = Integer.toString(value);
        String[] array = s.split("");
        for(int i = array.length - 1; i >= 0 ; i--) {
            Helper.show(array[i]);
        }
    }
}

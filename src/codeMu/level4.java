package codeMu;

public class level4 {
    public static void main(String[] args) {
        // Выведите в консоль все четные числа из промежутка от 1 до 100. +
//        EvenNumbers(1, 100);
        // String str = "abcde"; Переберите и выведите в консоль по очереди все символы с конца строки.
//        reverseStroke("abcde");
        // Дано целое число, содержащее номер минуты от 0 до 60: byte num = 30; Определите, в какую четверть часа попадает это значение.
//        byte num = 30;
//        quaterHour(num);
    }

    static void EvenNumbers(int minValue, int maxValue) {
        while (minValue <= maxValue) {
            if(minValue % 2 == 0) {
                System.out.println(minValue);
            }
            minValue++;
        }
    }

    static void reverseStroke(String value) {
        int count = 0;
        String reverseValue = new StringBuilder(value).reverse().toString();
        String[] reverseValueArray = reverseValue.split("");
        while (count < value.length()) {
            System.out.println(reverseValueArray[count]);
            count++;
        }
    }

    static void quaterHour(byte number) {
        // Дано целое число, содержащее номер минуты от 0 до 60: byte num = 30; Определите, в какую четверть часа попадает это значение.
        if(number >= 0 && number <= 60) {
            if(number >= 0 && number <= 15) {
                System.out.println("1");
            }
            if(number > 15 && number <= 30) {
                System.out.println("2");
            }
            if(number > 30 && number <= 45) {
                System.out.println("3");
            }
            if(number > 45 && number <= 60) {
                System.out.println("4");
            }
        } else {
            System.out.println("Передано неправильное значение минуты");
        }
    }
}

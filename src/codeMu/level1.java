package codeMu;

public class level1 {
    public static void main(String[] args) {
//        Exercise1(20);
//        showStrokeLength("hello world");
//        showLastSymbol("Zhadyra");
//        evenUnEven(9);
//        firstLetterTheSame("Zharkyn", "Zhadyra");
//        System.out.println(getLastLetterCompare("Жарк Ынь"));
//        System.out.println(getFirstFigure(20));
//        getSumFirstLastSymbol(23);
//        getLastFigure(45);
//        getFigureLengthSymbol(234);
//        checkFirstSymbolTheSame(235, 664);
    }

    static void Exercise1(Integer value) {
        // Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.  +
        if(value != null) {
            if(value >= 0) {
                System.out.println("Число " + value + " положительное");
            } else {
                System.out.println("Число " + value + " Отрицательное");
            }
        } else {
            System.out.println("Не передано число");
        }
    }

    static void showStrokeLength(String value) {
        // Дана строка. Выведите в консоль длину этой строки.  +
        if(value.isEmpty()) {
            System.out.println("Пустая строка");
        } else {
            System.out.println("Длина строки " + value + " составляет " + value.length());
        }
    }

    static void showLastSymbol(String value) {
        // Дана строка. Выведите в консоль последний символ строки.  +
        System.out.println(value.charAt(value.length() - 1));
    }

    static void evenUnEven(Integer value) {
        // Дано число. Проверьте, четное оно или нет. +
        if(value % 2 == 0) {
            System.out.println("Число " + value + " четное");
        } else {
            System.out.println("Число " + value + " нечетное");
        }
    }

    static void firstLetterTheSame(String value1, String value2) {
        // Даны два слова. Проверьте, что первые буквы этих слов совпадают.    +
        if(value1.charAt(0) == value2.charAt(0)) {
            System.out.println("Первые буквы совпадают");
        } else {
            System.out.println("Первые буквы не совпадают");
        }
    }

    static char getLastLetterCompare(String value) {
        // Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.  +
        char letter = 'ь';
        char lastLetter;
        if(value.charAt(value.length() - 1) == letter) {
            lastLetter = value.charAt(value.length() - 2);
        } else {
            lastLetter = value.charAt(value.length() - 1);
        }
        return lastLetter;
    }

    static Integer getFirstFigure(Integer value) {
        // Дано целое число. Выведите в консоль первую цифру этого числа.   +
        if(value >= 10) {
            String s = value.toString();
            char c = s.charAt(0);
            return Character.getNumericValue(c); // преобразование в int
        } else {
            return value;
        }
    }

    static void getLastFigure(Integer value) {
        // Дано целое число. Выведите в консоль последнюю цифру этого числа. +
        String s = value.toString();
        String lastSymbol = s;
        if(s.length() > 1) {
            char c = s.charAt(s.length() - 1);
            lastSymbol = Character.toString(c);
        }
        System.out.println(lastSymbol);
    }

    static void getSumFirstLastSymbol(Integer value) {
        // Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа. +
        String s = value.toString();
        char firstFigure = s.charAt(0); // первая цифра
        Integer sum = Character.getNumericValue(firstFigure);
        if(s.length() > 1) {
            char lastFigure = s.charAt(s.length() - 1); // последняя цифра
            sum += Character.getNumericValue(lastFigure);
        }

        System.out.println("Сумма = " + sum);
    }

    static void getFigureLengthSymbol(Integer value) {
        // Дано целое число. Выведите количество цифр в этом числе. +
//        String s = value.toString();
//        System.out.println(s.length());
        int count = 0;
        int intValue = Math.abs(value);
        while (intValue > 0) {
            intValue /= 10;
            count++;
        }
        System.out.println(count);
    }

    static void checkFirstSymbolTheSame(Integer value1, Integer value2) {
        // Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают. +
        String s1 = value1.toString();
        String s2 = value2.toString();
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        if(c1 == c2) {
            System.out.println("Первые цифры одинаковы");
        } else {
            System.out.println("Первые цифры не одинаковы");
        }
    }
}

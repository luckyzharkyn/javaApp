package reviseLessons;

public class level1 {
    public static void main(String[] args) {
        // №1 Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
        // task1(-20);
        // №2 Дана строка. Выведите в консоль длину этой строки.
//        System.out.println(task2("Zharkyn"));
        // №3 Дана строка. Выведите в консоль последний символ строки.
//        System.out.println(task3(""));
        // №4 Дано число. Проверьте, четное оно или нет.
//        System.out.println(task4(5));
        // №5 Даны два слова. Проверьте, что первые буквы этих слов совпадают.
//        System.out.println(task5("Zharkyn", "Zekzat"));
        // №6 Дано слово. Получите его последнюю букву. Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.
        System.out.println(task6("Zharkynь"));
    }

    static char task6(String value) {
        char last = value.charAt(value.length() - 1);
        if(last == 'ь') {
            return value.charAt(value.length() - 2);
        }
        return last;
    }

    static void task1(int value) {
        if(value >= 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static int task2(String value) {
        return value.length();
    }

    static char task3(String value) {
        return value.length() > 0 ? value.charAt(value.length() - 1) : null;
    }

    static String task4(int value) {
        if(value % 2 == 0) {
            return "Четное";
        }
        return "Нечетное";
    }

    static boolean task5(String value1, String value2) {
        char first = value1.charAt(0);
        char second = value2.charAt(0);
        return first == second;
    }
}

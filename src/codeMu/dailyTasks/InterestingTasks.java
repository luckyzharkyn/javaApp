package codeMu.dailyTasks;

public class InterestingTasks {
    public static void main(String[] args) {
        // Задача 1
        // Нахождение слов
        // Дана строка со словами. Не используя массивы, циклы и регулярные выражения выведите на экран:
        // первое слово, второе слово, последнее слово.
        task1("Hello my name is Zharkyn!");
    }

    static void task1(String value) {
        System.out.println(value.split(" "));
    }
}

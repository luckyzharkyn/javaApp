package codeMu.level1;

import java.util.ArrayList;
import java.util.logging.Logger;

public class level10 {
    public static void main(String[] args) {
        // №1 Найдите сумму всех целых четных чисел в промежутке от 1 до 100.
        // int sum = findSum();
        // Helper.show(sum);

        // №2 Напишите программу, которая узнает, сколько секунд содержится в году.
        // Helper.show(findSecondOfYear());

        // №3 Дано некоторое целое число: Выведите в консоль все делители этого числа.
//        int num = 12;
//        ArrayList<Integer> arrayList = findDelitely(num);
//        for (Integer t : arrayList) {
//            Helper.show(t);
//        }
        // №4
        // Дано некоторое число:  Делите его на два столько раз, пока результат не будет меньше 10. Сколько итераций для этого потребуется?
//         float num = 12345;
//         Helper.show(countIteration(num));
    }

    static int findSum() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int findSecondOfYear() {
        return 365 * 24 * 60 * 60;
    }

    static ArrayList<Integer> findDelitely(int value) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 1;
        while (count <= value) {
            if(value % count == 0) {
                arrayList.add(count);
            }
            count++;
        }
        return arrayList;
    }

    static int countIteration(float num) {
        float result = num;
        int count = 0;
        while (result >= 10) {
            result /= 2;
            count++;
        }
        return count;
    }
}

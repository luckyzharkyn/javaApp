package codeMu.level1;

import codeMu.Helper;

public class level9 {
    public static void main(String[] args) {
        // Даны два слова. Проверьте, что последняя буква первого слова совпадает с первой буквой второго слова.
//        String w = "Zharkyn";
//        String k = "Nazar";
//        Helper.show(compareTwoWords(w, k));

        // Напишите программу, которая узнает, сколько секунд содержится в сутках.
//        Helper.show(SecondFromMinutes(10000));
        // Выведите в консоль все целые числа от -100 до 0.
//        ShowFigures();

        // Даны три символа:

         char chr1 = '1';
         char chr2 = '2';
         char chr3 = '3';
        // Слейте эти символы в число: 123
        Helper.show(
                Integer.parseInt(
                    Helper.mergeStroke(
                            new Character(chr1).toString(),
                            new Character(chr2).toString(),
                            new Character(chr3).toString()
                    )
                )
        );
    }

    static boolean compareTwoWords(String word1, String word2) {
        return word1.toLowerCase().charAt(word1.length() - 1) == word2.toLowerCase().charAt(0);
    }

    static int SecondFromMinutes(int countDay) {
        return countDay * 24 * 60 * 60;
    }

    static void ShowFigures() {
        int count = -100;
        while (count <= 0) {
            Helper.show(count);
            count++;
        }
    }


}

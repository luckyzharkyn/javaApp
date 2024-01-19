package codeMu.level5;

import codeMu.Helper;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class level45 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //№1 Попросите у пользователя ввести через консоль целое число из промежутка от 1 до 10. Если будет введено что-то другое, то попросите пользователя ввести число еще раз.
//        Helper.show("Введите число от 1 до 10");
//        Scanner scanner = new Scanner(System.in);
//        EnterFigure(scanner);
        //№2
        //Сформируйте с помощью циклов следующий массив:
        //int[] {
        //    {1, 2, 3},
        //    {1, 2, 3},
        //    {1, 2, 3},
        //    {1, 2, 3},
        //    {1, 2, 3},
        //}
//       int[][] ints = new int[5][3];
//       for(int i = 0; i < 5; i++) {
//           for(int j = 0; j < 3; j++) {
//               ints[i][j] = j + 1;
//           }
//       }
//       for(int[] elem : ints) {
//           Helper.show(Arrays.toString(elem));
//       }

        //№3 Дана некоторая строка:
//        String s = "abcdeabc";
        //Очистите ее от дублей символов:
        //"abcde"
//        Set<Character> set = new HashSet<>();
//        for(int i = 0; i < s.length(); i++) {
//            set.add(s.charAt(i));
//        }
//        Helper.show(set.toString());


        //№4 Дана некоторая строка:
//        String s = "abcde";
//        //Переведите в верхний регистр все нечетные буквы этой строки. В нашем случае должно получится следующее:
//        //"AbCdE"
//        StringBuilder stringBuilder = new StringBuilder();
//        for(int i = 0; i < s.length(); i++) {
//            if(i % 2 == 0) {
//                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
//            } else {
//                stringBuilder.append(s.charAt(i));
//            }
//        }
//        Helper.show(stringBuilder.toString());
    }
    static void EnterFigure(Scanner scanner) {
        if(scanner.hasNextInt()) {
            Helper.show("yes baby");
        } else {
            Helper.show("Введите число еще раз");
            scanner.next();
            EnterFigure(scanner);
        }
    }
}


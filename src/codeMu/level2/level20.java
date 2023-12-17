package codeMu.level2;

import codeMu.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level20 {
    public static void main(String[] args) {
        //    №1 Дана переменная, содержащая радиус шара:
//              float r = 10.3f;
//        //    Получите объем и площадь поверхности этого шара.
//              double V = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
//              Helper.show(V);
//
//              double S = 4.0 * Math.PI * Math.pow(r, 2);
//              Helper.show(S);

        //    №2 Даны два целых числа:
//            int num1 = 12;
//            int num2 = 16;
////          Выведите в консоль все общие делители этих чисел.
//            ArrayList<Integer> result1 = getDelitely(num1);
//            ArrayList<Integer> result2 = getDelitely(num2);
//            Helper.showArray(result1);
//            Helper.showArray(result2);

        //    №3 Дан массив с целыми числами:
//            int[] array = {1, 2, 3, 4, 5};
//        //    Поменяйте местами первый и последний элементы этого массива:
//        //    int[] {5, 2, 3, 4, 1};
//            int temp = array[0];
//            array[0] = array[array.length - 1];
//            array[array.length - 1] = temp;

        //    №4 Дано число из 6-ти цифр
//            int num = 123321;
//        //    Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр.
//            String numString = Integer.toString(num);
//
//            List<Integer> list = new ArrayList<>();
//            for(char elem : numString.toCharArray()) {
//                list.add(Character.getNumericValue(elem));
//            }
//            int sizeList = list.size();
//            if(list.get(0) + list.get(1) + list.get(2) == list.get(sizeList - 1) + list.get(sizeList - 2) + list.get(sizeList - 3)) {
//                Helper.show("Yes of course");
//            } else {
//                Helper.show("No");
//            }
    }

    static ArrayList<Integer> getDelitely(int value) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= value; i++) {
            if(value % i == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}

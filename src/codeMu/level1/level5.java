package codeMu.level1;

import codeMu.interfaces.interfaceLevel5;

import java.util.ArrayList;

public class level5 implements interfaceLevel5 {
    public static void main(String[] args) {
        level5 element = new level5();
//        element.oneToHundred();
//        boolean result = element.firstDelSecondValue(20, 10);
//        System.out.println(result);
        // Выведите в консоль все числа кратные трем в промежутке от 1 до 100.+

        // Даны два целых числа. Проверьте, что первое число без остатка делится на второе.+

        //        char chr1 = 'a';
        //        char chr2 = 'b';
        //        char chr3 = 'c';
        //        Слейте эти символы в строку:
        //        String "abc"                 +++++++++

//        char chr1 = 'a';
//        char chr2 = 'b';
//        char chr3 = 'c';
//        ArrayList<Character> list = new ArrayList<>();
//        list.add(chr1);
//        list.add(chr2);
//        list.add(chr3);
//        String result = element.mergeStrokes(list);
//        System.out.println(result);

        //  Дано целое число, содержащее количество килобайт:
        //        int kb = 35;
        //        Переведите это значение в байты.
        int kb = 35;
        byte result = element.intToByteConvert(kb);
        System.out.println(result);
    }

    @Override
    public void oneToHundred() {
        int minValue = 1;
        int maxValue = 100;
        while (minValue <= maxValue) {
            if(minValue % 3 == 0) {
                System.out.println(minValue);
            }
            minValue++;
        }
    }

    @Override
    public String mergeStrokes(ArrayList<Character> list) {
        if(list.size() > 0) {
            StringBuilder s = new StringBuilder();
            for(Character c : list) {
                s.append(c);
            }
            return s.toString();
        }
        return "";
    }

    @Override
    public byte intToByteConvert(int value) {
        byte num = (byte) (value * 1024 % 256);
        return num;
    }

    @Override
    public boolean firstDelSecondValue(int firstValue, int secondValue) {
        if(secondValue != 0) {
            if(firstValue % secondValue == 0) {
                return true;
            }
        }
        return false;
    }
}


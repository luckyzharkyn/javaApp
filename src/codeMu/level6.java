package codeMu;
import codeMu.interfaces.interfaceLeve6;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class level6 implements interfaceLeve6 {

    public static void main(String[] args) {
        level6 level6 = new level6();

        // Найдите сумму всех целых чисел от 1 до 100.
//        int minValue = 1;
//        int maxValue = 100;
//
//        int result = level6.sumAllFigures(minValue, maxValue);
//        System.out.println(result);

        // Даны три символа. Сложите значения этих символов как целые числа.
//        ArrayList<Character> list = new ArrayList<>(Arrays.asList('1', '2', '3'));

//        int result = level6.sumChar(list);
//        System.out.println(result);


        // Дано целое число, содержащее количество мегабайт. Переведите это значение в байты.
//        int mb = 35;
//        int result = level6.mbConvertToByte(mb);
//        System.out.println(result);
    }

    @Override
    public int sumAllFigures(int value1, int value2) {
        int count = value1 + 1;
        int sum = value1;
        while (count <= value2) {
            sum += count;
            count++;
        }
        return sum;
    }

    @Override
    public int sumChar(ArrayList<Character> array) {
        int sum = 0;
        for(Character c : array) {
            int i = Character.getNumericValue(c);
            sum += i;
        }
        return sum;
    }

    @Override
    public int mbConvertToByte(int value) {
        return value * 1024 * 1024;
    }
}

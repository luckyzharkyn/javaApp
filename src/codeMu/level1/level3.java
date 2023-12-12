package codeMu.level1;

import java.util.ArrayList;

public class level3 {
    public static void main(String[] args) {
//        showFigures();
//        showPreLastSymbol("Marat ");
//        podelit(2, 5);
        byte num = 10;
        getMonth(num);
    }


    static void showFigures() {
        // Выведите в консоль все целые числа от 1 до 100. +
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void showPreLastSymbol(String value) {
        //  Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки. +
        if(value.length() > 1) {
            value = value.replace(" ", "");
            char lastSymbol = value.charAt(value.length() - 2);
            System.out.println(lastSymbol);
        } else {
            System.out.println(value);
        }
    }

    static void podelit(int value1, int value2) {
        //  Даны два целых числа. Найдите остаток от деления первого числа на второе. +
        if(value2 != 0) {
            System.out.println(value1 % value2);
        }
    }

    static void getMonth(byte num) {
        //  Дано целое число, содержащее номер месяца от 1 до 12:  Определите, в какую пору года попадает этот месяц.
        ArrayList<String> month = new ArrayList<>();
        month.add("Январь");
        month.add("Февраль");
        month.add("Март");
        month.add("Апрель");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        month.add("Сентябрь");
        month.add("Октябрь");
        month.add("Ноябрь");
        month.add("Декабрь");

        if(num > 0 && num <= 12) {
            System.out.println(month.get(num - 1));
        } else {
            System.out.println("Передано неправильное число");
        }
    }
}





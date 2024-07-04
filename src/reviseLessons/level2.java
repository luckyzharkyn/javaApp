package reviseLessons;

import db.DatabaseHandler;
import DTO.City;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class level2 {
    public static void main(String[] args) {
        // №1 Дано целое число. Выведите в консоль первую цифру этого числа.
//        task1();
        // №2 Дано целое число. Выведите в консоль последнюю цифру этого числа.
//        task2(2);
        // №3 Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.
//            task3(234);
        // №4 Дано целое число. Выведите количество цифр в этом числе.
//            task4(234243);
        // №5 Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
//        task5(20, 25);
    }

    static void task5(int value1, int value2) {
        String str1 = String.valueOf(value1);
        String str2 = String.valueOf(value2);

        if(Character.getNumericValue(str1.charAt(0)) == Character.getNumericValue(str2.charAt(0))) {
            out.println("yes");
        } else {
            out.println("no");
        }
    }

    static void task4(int value) {
        out.println(String.valueOf(value).length());
    }

    static void task3(int value) {
        String str = String.valueOf(value);
        out.println(Character.getNumericValue(str.charAt(0)) + Character.getNumericValue(str.charAt(str.length() - 1)));
    }

    static void task1() {
        DatabaseHandler dbHandler = DatabaseHandler.getDatabaseHandler();
        String selectSql = "Select * from world.city LIMIT 0, 1";

        List<City> cities = dbHandler.executeQuery(selectSql, resultSet -> {
            List<City> cityList = new ArrayList<>();
            while (resultSet.next()) {
                City city = new City();
                city.setId(Integer.parseInt(resultSet.getString("id")));
                city.setName(resultSet.getString("Name"));
                city.setCountryCode(resultSet.getString("CountryCode"));
                city.setDistrict(resultSet.getString("District"));
                city.setPopulation(Integer.parseInt(resultSet.getString("Population")));
                cityList.add(city);
            }
            return cityList;
        });
        for(City city : cities) {
            System.out.println(city.getName());
        }
    }

    static void task2(int value) {
        String str = String.valueOf(value);
        out.println(str.charAt(str.length() - 1));
    }
}

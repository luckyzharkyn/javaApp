package reviseLessons;

import db.DatabaseHandler;
import reviseLessons.dto.City;

import java.util.ArrayList;
import java.util.List;

public class level2 {
    public static void main(String[] args) {
        // №1 Дано целое число. Выведите в консоль первую цифру этого числа.
        task1();
        // №2 Дано целое число. Выведите в консоль последнюю цифру этого числа.

        // №3 Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.

        // №4 Дано целое число. Выведите количество цифр в этом числе.

        // №5 Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.
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
}

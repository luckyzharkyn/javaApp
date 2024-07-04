package db;

import DTO.City;
import DTO.User;
import services.Helper;

import java.util.ArrayList;
import java.util.List;

public class GetTableData {
    public static List<City> getCityByIds(ArrayList<Integer> ids) {
        DatabaseHandler dbHandler = DatabaseHandler.getDatabaseHandler();
        StringBuilder str = new StringBuilder("(");
        for(int i = 0; i < ids.size(); i++) {
            str.append(ids.get(i));
            if(i != ids.size() - 1) {
                str.append(",");
            }
        }
        str.append(")");

        String selectQuery = "SELECT * FROM world.city WHERE id IN " + str.toString() + ";";
        Helper.show("selectQuery", selectQuery);
        List<City> cities = dbHandler.executeQuery(selectQuery, resultSet -> {
            List<City> cityList = new ArrayList<>();
            while (resultSet.next()) {
                City city = new City();
                city.setId(Integer.parseInt(resultSet.getString("ID")));
                city.setCountryCode(resultSet.getString("CountryCode"));
                city.setDistrict(resultSet.getString("District"));
                city.setPopulation(Integer.parseInt(resultSet.getString("Population")));
                city.setName(resultSet.getString("Name"));
                cityList.add(city);
            }
            return cityList;
        });

        return cities;
    }
}
